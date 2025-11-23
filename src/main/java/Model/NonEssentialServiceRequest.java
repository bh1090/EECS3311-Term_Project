package Model;

public class NonEssentialServiceRequest extends ServiceRequest{

     public NonEssentialServiceRequest(int nonEssentialServiceRequestID, String description, String status, int roomID){
          super(nonEssentialServiceRequestID, description, status, roomID);
     }
     public boolean isEssential(){
          return false;
     }    
}
