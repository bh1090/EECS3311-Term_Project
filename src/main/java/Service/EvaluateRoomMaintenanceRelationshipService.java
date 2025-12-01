package Service;

import java.util.ArrayList;
import java.util.List;

import Model.ServiceRequest.ServiceRequest;
import Model.Room.Subject;
import Model.Room.Observer;
import Service.RoomService;

public final class EvaluateRoomMaintenanceRelationshipService implements Subject {

    private static EvaluateRoomMaintenanceRelationshipService instance = null;
    private int currentRoomID;
    private final List<Observer> observers = new ArrayList<>();
    private boolean isAnyEssentialMaintenanceRequestPending;

    private EvaluateRoomMaintenanceRelationshipService() {}

    public static EvaluateRoomMaintenanceRelationshipService getInstance() {
        if (instance == null) {
            instance = new EvaluateRoomMaintenanceRelationshipService();
        }
        return instance;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(isAnyEssentialMaintenanceRequestPending, currentRoomID);
        }
    }

    public void evaluateRoomMaintenanceRelationship(int roomID) {

        GetMaintenanceRequestService getMaintenanceRequestService = GetMaintenanceRequestService.getInstance();

        isAnyEssentialMaintenanceRequestPending = doesRoomHaveEssentialMaintenanceRequests(
            roomID, getMaintenanceRequestService
        );

        notifyObservers();
    }
    
    public boolean isAnyEssentialMaintenanceRequestPending() {
        return isAnyEssentialMaintenanceRequestPending;
    }

    public boolean doesRoomHaveEssentialMaintenanceRequests(int roomID, GetMaintenanceRequestService getMaintenanceRequestService ){
        ArrayList<ServiceRequest> essentialRequests = getMaintenanceRequestService.getServiceRequests(roomID, true);
        boolean hasPendingEssentialRequests = false;
        for(ServiceRequest request : essentialRequests){
            if(request.getStatus().equals("To-do") || request.getStatus().equals("In Progress")){
                hasPendingEssentialRequests = true;
                break;
            }
        }
        return hasPendingEssentialRequests;
    }
}
