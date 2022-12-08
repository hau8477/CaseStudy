package views.furama_menu;

import controllers.FacilityController;
import models.facilitys.Facility;
import views.furama_menu.facility_view.FacilityAddNewMenu;

import java.util.Map;
import java.util.Scanner;

public class FacilityView {
    private static final Scanner scanner = new Scanner(System.in);

    private static final FacilityController facilityController = new FacilityController();

    public static void displayFacilityMenu() {
        int choice = 0;

        do {
            System.out.print("---------------Facility Management---------------\n" +
                    "1. Display list facility.\n" +
                    "2. Add new facility.\n" +
                    "3. Display list facility maintenance.\n" +
                    "4. Return main menu.\n" +
                    "Please enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }

            switch (choice) {
                case 1:
                    System.out.println("---------------List Facility---------------");
                    Map<Facility, Integer> facilityIntegerMap = facilityController.getListFacility();

                    if (facilityIntegerMap.isEmpty()) {
                        System.out.println("List empty.");
                    }

                    for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                        System.out.println(entry.getKey().toString() + ". Times of use: " + entry.getValue());
                    }
                    break;
                case 2:
                    FacilityAddNewMenu.displayMenu();
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Goodbye customers and see you again!");
                    return;
                default:
                    System.err.println("You entered the wrong choice, please re-enter!");
            }
        } while (true);
    }
}
