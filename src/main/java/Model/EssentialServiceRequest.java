package Model;

public class EssentialServiceRequest extends ServiceRequest{

     public EssentialServiceRequest(String essentialServiceRequestID, String description, String status){
          super(essentialServiceRequestID, description, status);
     }

     @Override
     public String getServiceRequestID() {
          return super.getServiceRequestID();
     }
}
