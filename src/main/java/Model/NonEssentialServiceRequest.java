package Model;

public class NonEssentialServiceRequest extends ServiceRequest{

     public NonEssentialServiceRequest(String nonEssentialServiceRequestID, String description, String status){
          super(nonEssentialServiceRequestID, description, status);

     }
     @Override
     public String getServiceRequestID(){
          return super.getServiceRequestID();
     }
     public void promoteServiceRequest(NonEssentialServiceRequest nesr){
          //To-do: make so nesr gets added to a specific rooms arraylist of
          // essential service requests.
     }

}
