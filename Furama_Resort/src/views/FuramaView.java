package views;

import controllers.CustomerController;
import controllers.FacilityController;
import models.facilitys.Facility;
import models.persons.inheritance.Customer;
import views.furama_menu.*;
import views.furama_menu.FacilityView;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FuramaView {
    private static final Scanner scanner = new Scanner(System.in);

    private static final CustomerController customerController = new CustomerController();

    private static final FacilityController facilityController = new FacilityController();

    public static void displayMainMenu() {
        int choice = 0;

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
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
            }

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
                    System.out.println("---------------Booking Management---------------\n");

                    List<Customer> customers = customerController.getListCustomer();
                    Map<Facility, Integer> facilityIntegerMap = facilityController.getListFacility();

                    System.out.println("---------------List Customer---------------");

                    if (customers.isEmpty()) {
                        System.out.println("List empty.");
                    }

                    for (Customer customer : customers) {
                        System.out.println(customer);
                    }

                    System.out.println("---------------List Facility---------------");

                    if (facilityIntegerMap.isEmpty()) {
                        System.out.println("List empty.");
                    }

                    for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                        System.out.println(entry.getKey().toString() + ". Times of use: " + entry.getValue());
                    }

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
