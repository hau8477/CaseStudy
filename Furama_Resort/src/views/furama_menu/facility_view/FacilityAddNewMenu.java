package views.furama_menu.facility_view;

import controllers.FacilityController;
import models.facilitys.inheritance.Room;
import models.facilitys.inheritance.Villa;

import java.util.Scanner;

public class FacilityAddNewMenu {
    private static final Scanner scanner = new Scanner(System.in);

    private static final FacilityController facilityController = new FacilityController();

    public static void displayMenu() {
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
                    System.out.print("Enter area use: ");
                    String useAreaVilla = scanner.nextLine();

                    System.out.print("Enter cost rent: ");
                    String rentCostVilla = scanner.nextLine();

                    System.out.print("Enter maximum person: ");
                    String maxPersonVilla = scanner.nextLine();

                    System.out.print("Enter rental type: ");
                    String rentalTypeVilla = scanner.nextLine();

                    System.out.print("Enter standard room: ");
                    String roomStandard = scanner.nextLine();

                    System.out.print("Enter area pool: ");
                    String poolArea = scanner.nextLine();

                    System.out.print("Enter number floor: ");
                    String floorNumbers = scanner.nextLine();

                    Villa villa = new Villa("Villa", useAreaVilla, rentCostVilla, maxPersonVilla,
                            rentalTypeVilla, roomStandard,
                            poolArea, floorNumbers);
                    countOfUsesVilla++;
                    facilityController.addNewFacility(villa, countOfUsesVilla);
                    break;
                case 2:
                    System.out.print("Enter area use: ");
                    String useAreaRoom = scanner.nextLine();

                    System.out.print("Enter cost rent: ");
                    String rentCostRoom = scanner.nextLine();

                    System.out.print("Enter maximum person: ");
                    String maxPersonRoom = scanner.nextLine();

                    System.out.print("Enter rental type: ");
                    String rentalTypeRoom = scanner.nextLine();

                    System.out.print("Enter service included free: ");
                    String freeServiceIncludedRoom = scanner.nextLine();

                    Room room = new Room("Room", useAreaRoom, rentCostRoom, maxPersonRoom,
                            rentalTypeRoom, freeServiceIncludedRoom);
                    countOfUsesRoom++;
                    facilityController.addNewFacility(room, countOfUsesRoom);
                    break;
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
