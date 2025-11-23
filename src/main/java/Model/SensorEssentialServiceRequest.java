package Model;

public class SensorEssentialServiceRequest extends ServiceRequest{

     private int sensorID;
     public SensorEssentialServiceRequest(int sensorEssentialServiceRequestID, String description, String status, int roomID, int sensorID){

          super(sensorEssentialServiceRequestID, description, status, roomID);
          this.sensorID = sensorID;
     }

     @Override
     public int getServiceRequestID(){
          return super.getServiceRequestID();
     }
     public boolean isEssential(){
          return true;
     }    
     public void assignRoomID(int roomID){
          setRoomID(roomID);
     }  
     public int getSensorID(){
        return this.sensorID;
    }
}
