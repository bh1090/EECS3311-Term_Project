package Model;

public class EssentialServiceRequest extends ServiceRequest{

     public EssentialServiceRequest(int essentialServiceRequestID, String description, String status){
          super(essentialServiceRequestID, description, status);
     }

     @Override
     public int getServiceRequestID() {
          return super.getServiceRequestID();
     }
}
