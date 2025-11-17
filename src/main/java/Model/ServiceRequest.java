package Model;

public abstract class ServiceRequest {
     private final int serviceRequestID;
     private String description;
     private String status;

     public ServiceRequest(int serviceRequestID, String description, String status) {
          this.serviceRequestID = serviceRequestID;
          this.description = description;
          this.status = status;
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
     public void setStatus(String updatedStatus) {
          this.status = updatedStatus;
     }
}
