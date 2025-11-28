package Model.User;

public class EventCoordinator{
     private String chiefEventCoordinatorName;
     private String chiefEventCoordinatorEmail;
     private String chiefEventCoordinatorPassword;

     public EventCoordinator(String chiefEventCoordinatorName, String chiefEventCoordinatorEmail,String chiefEventCoordinatorPassword){
          this.chiefEventCoordinatorName = chiefEventCoordinatorName;
          this.chiefEventCoordinatorEmail = chiefEventCoordinatorEmail;
          this.chiefEventCoordinatorPassword = chiefEventCoordinatorPassword;
     }

     public String getChiefEventCoordinatorName(){
          return this.chiefEventCoordinatorName;
     }
     public void setChiefEventCoordinatorName(String chiefEventCoordinatorName){
          this.chiefEventCoordinatorName = chiefEventCoordinatorName;
     }
     public String getChiefEventCoordinatorEmail(){
          return this.chiefEventCoordinatorEmail;
     }
     public void setChiefEventCoordinatorEmail(String chiefEventCoordinatorEmail){
          this.chiefEventCoordinatorEmail = chiefEventCoordinatorEmail;
     }
}
