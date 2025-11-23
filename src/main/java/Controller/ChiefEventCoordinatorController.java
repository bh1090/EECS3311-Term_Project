package Controller;

import Service.UserService;
import Model.AccountType;

public class ChiefEventCoordinatorController {
     private final UserService userService;
     public ChiefEventCoordinatorController(UserService userService, AccountType accountType){
          this.userService = userService;
     }
     public void createAdmin(String newAdminName, String newAdminEmail, String newAdminPassword) {
          // userService.createUser(accountType.STAFF, newAdminName, newAdminEmail, newAdminPassword);

     }
}
