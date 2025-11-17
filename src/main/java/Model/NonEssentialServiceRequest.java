package Model;

public class NonEssentialServiceRequest extends ServiceRequest{

     public NonEssentialServiceRequest(int nonEssentialServiceRequest){
          super(nonEssentialServiceRequest);

     }
     @Override
     public int getServiceRequestID(){
          return super.getServiceRequestID();
     }

}
