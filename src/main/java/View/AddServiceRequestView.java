package View;

import Controller.AddServiceRequestController;
import java.util.Scanner;

public class AddServiceRequestView {
     final AddServiceRequestController serviceRequestController;

     public AddServiceRequestView(AddServiceRequestController serviceRequestController) {
          this.serviceRequestController = serviceRequestController;
     }
     public void getUserInput(){
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter the room ID: ");
          int roomID = sc.nextInt();

          System.out.print("Enter the description of the service request: ");
          String description = sc.nextLine();

          System.out.print("Enter whether or not it is essential:");
          boolean isEssential = sc.nextBoolean();

          serviceRequestController.handleServiceRequestSubmission(roomID, description, isEssential);
     }
}
