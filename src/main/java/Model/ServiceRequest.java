package Model;

public abstract class ServiceRequest {
     private int serviceRequestID;
     private String description;

     public ServiceRequest(int serviceRequestID, String description) {
          this.serviceRequestID = serviceRequestID;
          this.description = description;
     }

     public int getServiceRequestID() {
          return this.serviceRequestID;
     }
}
