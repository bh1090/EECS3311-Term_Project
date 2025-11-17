package Model;

public class EssentialServiceRequest extends ServiceRequest{
     private String status;
     public EssentialServiceRequest(int essentialServiceRequestID, String description, String status){
          super(essentialServiceRequestID, description);
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
