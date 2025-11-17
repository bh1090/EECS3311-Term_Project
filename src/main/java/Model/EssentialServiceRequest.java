package Model;

public class EssentialServiceRequest extends ServiceRequest{
     private String status;
     public EssentialServiceRequest(int serviceRequestID, String status){
          super(serviceRequestID);
          this.status = status;
     }
     public String getStatus(){
          return this.status;
     }
     public void setStatus(String status){
          this.status = status;
     }
     @Override
     public int getServiceRequestID() {
          return super.getServiceRequestID();
     }
}
