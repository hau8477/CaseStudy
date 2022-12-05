package views.furama_menu.facility_view;

import controllers.FacilityController;
import models.facilitys.inheritance.Room;
import models.facilitys.inheritance.Villa;

import java.util.Scanner;

public class FacilityMenu {
    private static final Scanner scanner = new Scanner(System.in);

    private static final FacilityController facilityController = new FacilityController();

    public static void displayMenu(){
        int choice;
        int countOfUsesVilla = 0;
        int countOfUsesRoom = 0;

        do {
            System.out.print("---------------Service---------------\n" +
                    "1. Add New Villa.\n" +
                    "2. Add New Room.\n" +
                    "3. Back to menu.\n" +
                    "Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    Villa villa = new Villa();
                    countOfUsesVilla++;
                    facilityController.addNewFacility(villa,countOfUsesVilla);
                    break;
                case 2:
                    Room room = new Room();
                    countOfUsesRoom++;
                    facilityController.addNewFacility(room,countOfUsesRoom);
                case 3:
                    System.out.println("Goodbye customers and see you again!");
                    FacilityView.displayFacilityMenu();
                    break;
                default:
                    System.err.println("You entered the wrong choice, please re-enter!");
            }
        } while (choice != 3);
    }
}
