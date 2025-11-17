package Model;

public class NonEssentialServiceRequest extends ServiceRequest{

     public NonEssentialServiceRequest(int nonEssentialServiceRequest){
          super(nonEssentialServiceRequest);

     }
     @Override
     public int getServiceRequestID(){
          return super.getServiceRequestID();
     }
     public void promoteServiceRequest(NonEssentialServiceRequest nesr){
          //To-do: make so nesr gets added to a specific rooms arraylist of
          // essential service requests.  
     }

}
