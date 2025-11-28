package Repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import Database.Database;
import Model.Room.Room;
import Model.State.RoomDisabledState;
import Model.State.RoomEnabledState;
import Model.State.RoomReadyForEnableState;

/**
 * Repository for managing Room data persistence via CSV.
 * Implements Singleton pattern to ensure only one point of access to the file.
 */
public class RoomRepository {
    private static RoomRepository instance = null;
    private List<Room> rooms = new ArrayList<>();

    // Private constructor to enforce Singleton
    public RoomRepository() {
        loadRoomsFromCSV();
    }

    public static synchronized RoomRepository getInstance() {
        if (instance == null) {
            instance = new RoomRepository();
        }
        return instance;
    }

    // === PUBLIC BUSINESS METHODS ===

    /**
     * Saves a room to the list and writes the entire list to CSV.
     * Acts as both "Create" and "Update".
     */
    public void save(Room room) {
        // Remove old version if it exists (update logic)
        rooms.removeIf(r -> r.getRoomId().equals(room.getRoomId()));
        rooms.add(room);
        saveRoomsToCSV();
    }

    public Room findById(String id) {
        return rooms.stream()
            .filter(r -> r.getRoomId().equals(id))
            .findFirst().orElse(null);
    }

    public List<Room> findAll() { 
        return new ArrayList<>(rooms); // Return copy to protect internal list
    }

    /**
     * Generates the next numeric ID by finding the max current ID.
     */
    public String generateNextId() {
        int maxId = 0;
        for (Room r : rooms) {
            try {
                int currentId = Integer.parseInt(r.getRoomId());
                if (currentId > maxId) maxId = currentId;
            } catch (NumberFormatException e) { 
                // Ignore non-numeric IDs
            }
        }
        return String.valueOf(maxId + 1);
    }

    // === CSV PERSISTENCE METHODS ===

    private void loadRoomsFromCSV() {
        rooms.clear();
        File file = new File(Database.ROOM_FILE);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            br.readLine(); // Skip Header
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                // Expecting: Room ID, Capacity, Location, Status, Price (Optional)
                if (values.length < 4) continue; 

                String id = values[0].trim();
                String capacity = values[1].trim();
                String location = values[2].trim();
                String statusStr = values[3].trim();
                
                // Handle Price (Default to 0.0 if column missing)
                double price = 0.0;
                if (values.length >= 5) {
                    try {
                        price = Double.parseDouble(values[4].trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid price format for room " + id);
                    }
                }

                Room room = new Room(id, location, price, capacity);
                
                // Restore State
                if (statusStr.equalsIgnoreCase("DISABLED")) {
                    room.setState(new RoomDisabledState());
                } else if (statusStr.equalsIgnoreCase("READY_FOR_ENABLE")) {
                    room.setState(new RoomReadyForEnableState());
                } else {
                    room.setState(new RoomEnabledState());
                }

                rooms.add(room);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveRoomsToCSV() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(Database.ROOM_FILE))) {
            pw.println("Room ID,Capacity,Location,Status,Price"); 

            for (Room r : rooms) {
                pw.println(
                    r.getRoomId() + "," +
                    r.getRoomCapacity() + "," +
                    r.getLocation() + "," +
                    r.getState().getStateName() + "," +
                    r.getPrice() 
                );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}