package Model;

public class EssentialServiceRequest extends ServiceRequest{

     public EssentialServiceRequest(int essentialServiceRequestID, String description, String status, int roomID){
          super(essentialServiceRequestID, description, status, roomID);
     }

     @Override
     public int getServiceRequestID() {
          return super.getServiceRequestID();
     }
     @Override
     public boolean isEssential(){
          return true;
     }    
}
