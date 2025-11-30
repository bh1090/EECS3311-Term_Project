package Model.User;

public class EventCoordinator{
     private final String chiefEventCoordinatorName;
     private final String chiefEventCoordinatorEmail;
     private final String chiefEventCoordinatorPassword;

     private EventCoordinator(String chiefEventCoordinatorName, String chiefEventCoordinatorEmail,String chiefEventCoordinatorPassword){
          this.chiefEventCoordinatorName = chiefEventCoordinatorName;
          this.chiefEventCoordinatorEmail = chiefEventCoordinatorEmail;
          this.chiefEventCoordinatorPassword = chiefEventCoordinatorPassword;
     }

     public String getChiefEventCoordinatorName(){
          return this.chiefEventCoordinatorName;
     }
     public String getChiefEventCoordinatorEmail(){
          return this.chiefEventCoordinatorEmail;
     }
     public String getChiefEventCoordinatorPassword(){
          return this.chiefEventCoordinatorPassword;
     }
}
