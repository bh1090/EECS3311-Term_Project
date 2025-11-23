package Controller;

import Service.UserService;

public class ChiefEventCoordinatorController {
     final UserService userService;
     public ChiefEventCoordinatorController(UserService userService){
          this.userService = userService;
     }
     public void createAdmin(String newAdminName, String newAdminEmail, String newAdminPassword) {
          userService.createUser(AccountType.STAFF, newAdminName, newAdminEmail, newAdminPassword);

     }
}
