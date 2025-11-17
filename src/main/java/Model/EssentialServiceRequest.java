package Model;

public class EssentialServiceRequest extends ServiceRequest{
     private final boolean isEssential;
     public EssentialServiceRequest(String essentialServiceRequestID, String description, String status, boolean isEssential){
          super(essentialServiceRequestID, description, status);
          this.isEssential = isEssential;
     }
     public boolean getIsEssential(){
          return this.isEssential;
     }

     @Override
     public String getServiceRequestID() {
          return super.getServiceRequestID();
     }
}
