package Model;

public abstract class ServiceRequest {
     private final String serviceRequestID;
     private String description;

     public ServiceRequest(int serviceRequestID, String description) {
          this.serviceRequestID = serviceRequestID;
          this.description = description;
     }

     public int getServiceRequestID() {
          return this.serviceRequestID;
     }
     public String getDescription() {
          return this.description;
     }
}
