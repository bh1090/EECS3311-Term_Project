package Model;

public abstract class ServiceRequest {
     private final String serviceRequestID;
     private String description;
     private String status;

     public ServiceRequest(int serviceRequestID, String description) {
          this.serviceRequestID = serviceRequestID;
          this.description = description;
     }

     public String getServiceRequestID() {
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
