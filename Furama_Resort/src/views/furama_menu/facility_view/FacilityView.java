package views.furama_menu.facility_view;

import controllers.FacilityController;
import models.facilitys.Facility;
import views.FuramaView;

import java.util.Map;
import java.util.Scanner;

public class FacilityView {
    private static final Scanner scanner = new Scanner(System.in);

    private static final FacilityController facilityController = new FacilityController();

    public static void displayFacilityMenu() {
        int choice;

        do {
            System.out.print("---------------Facility Management---------------\n" +
                    "1. Display list facility.\n" +
                    "2. Add new facility.\n" +
                    "3. Display list facility maintenance.\n" +
                    "4. Return main menu.\n" +
                    "Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    Map<Facility, Integer> facilityIntegerMap = facilityController.getListFacility();
                    for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                        System.out.println(entry);
                    }
                    break;
                case 2:
                    FacilityMenu.displayMenu();
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Goodbye customers and see you again!");

                    facilityController.returnMainMenu();
                    break;
                default:
                    System.err.println("You entered the wrong choice, please re-enter!");
            }
        } while (choice != 4);
    }
}
