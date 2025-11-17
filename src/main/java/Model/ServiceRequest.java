package Model;

public abstract class ServiceRequest {
     private int serviceRequestID;

     public ServiceRequest(int serviceRequestID) {
          this.serviceRequestID = serviceRequestID;
     }

     public int getServiceRequestID() {
          return this.serviceRequestID;
     }
}
