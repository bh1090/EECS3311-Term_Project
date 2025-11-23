package Model;

public class NonEssentialServiceRequest extends ServiceRequest{

     public NonEssentialServiceRequest(int nonEssentialServiceRequestID, String description, String status, int roomID){
          super(nonEssentialServiceRequestID, description, status, roomID);
     }
     @Override
     public int getServiceRequestID(){
          return super.getServiceRequestID();
     }
     public boolean isEssential(){
          return false;
     }    
}
