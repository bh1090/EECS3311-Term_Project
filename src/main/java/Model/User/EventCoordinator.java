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
     private static EventCoordinator instance;
     public static EventCoordinator getInstance() {
          if (instance == null) {
               instance = new EventCoordinator("John Smith", "jsmith@yorku.ca", "!Password123");
          }
          return instance;
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