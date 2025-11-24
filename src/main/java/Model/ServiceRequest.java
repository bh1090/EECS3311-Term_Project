package Model;

public abstract class ServiceRequest {
     private final int serviceRequestID;
     private String description;
     private String status;
     public boolean isEssential;
     private int roomID;

     public ServiceRequest(int serviceRequestID, String description, String status, int roomID) {
          this.serviceRequestID = serviceRequestID;
          this.description = description;
          this.status = status;
          this.roomID = roomID;
     }

     public int getServiceRequestID() {
          return this.serviceRequestID;
     }
     public String getDescription() {
          return this.description;
     }
     public void setDescription(String newDescription) {
          this.description = newDescription;
     }
     public String getStatus() {
          return this.status;
     }
     public int getRoomID() {
          return this.roomID;
     }
     public void setRoomID(int updatedRoomID) {
          this.roomID = updatedRoomID;
     }
     public void setStatus(String updatedStatus) {
          this.status = updatedStatus;
     }
     public abstract boolean isEssential();  
}
