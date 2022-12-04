package views;

import views.furama_menu.*;

import java.util.Scanner;

public class FuramaView {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        int choice;

        do {
            System.out.print("     ---------------------Furama Resort---------------------\n" +
                    "---------------------Welcome to Furama Resort---------------------\n" +
                    "1. Employee Management.\n" +
                    "2. Customer Management.\n" +
                    "3. Facility Management.\n" +
                    "4. Booking Management.\n" +
                    "5. Promotion Management.\n" +
                    "6. Exit.\n" +
                    "Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    EmployeeView.displayEmployeeMenu();
                    break;
                case 2:
                    CustomerView.displayCustomerMenu();
                    break;
                case 3:
                    FacilityView.displayFacilityMenu();
                    break;
                case 4:
                    BookingView.displayBookingMenu();
                    break;
                case 5:
                    PromotionView.displayPromotionMenu();
                    break;
                case 6:
                    System.exit(1);
                default:
                    System.err.println("You entered the wrong choice, please re-enter!");
            }
        } while (true);
    }
}
