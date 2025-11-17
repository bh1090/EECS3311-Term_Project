package Model;

public class EssentialServiceRequest extends ServiceRequest{
     private boolean isComplete;
     public EssentialServiceRequest(int essentialServiceRequestID, String description, boolean status){
          super(essentialServiceRequestID, description);
          this.isComplete = status;
     }
     public boolean getComplete(){
          return this.isComplete;
     }
     public void setComplete(boolean complete){
          this.isComplete = complete;
     }
     @Override
     public int getServiceRequestID() {
          return super.getServiceRequestID();
     }
}
