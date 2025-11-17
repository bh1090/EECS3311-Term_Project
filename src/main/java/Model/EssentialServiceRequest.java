package Model;

public class EssentialServiceRequest extends ServiceRequest{
     private String status;
     public EssentialServiceRequest(int serviceRequestID, String status){
          super(serviceRequestID);
          this.status = status;
     }


     @Override
     public int getServiceRequestID() {
          return 0;
     }
     public String getStatus(){
          return this.status;
     }
}
