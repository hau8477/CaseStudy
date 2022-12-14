package views.furama_menu;

import controllers.CustomerController;
import libs.RegexForFurama;
import models.persons.inheritance.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private static final Scanner scanner = new Scanner(System.in);

    private static final CustomerController customerController = new CustomerController();

    public static void displayCustomerMenu() {
        int choice = 0;

        do {
            System.out.print("---------------Customer Management---------------\n" +
                    "1. Display list customers.\n" +
                    "2. Add new customer.\n" +
                    "3. Edit customer.\n" +
                    "4. Return main menu.\n" +
                    "Please enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }

            switch (choice) {
                case 1:
                    System.out.println("---------------List Customer---------------");
                    List<Customer> customers = customerController.getListCustomer();

                    if (customers.isEmpty()) {
                        System.out.println("List empty.");
                    }

                    for (Customer customer : customers) {
                        System.out.println(customer);
                    }
                    break;
                case 2:
                    System.out.print("Enter customer ID: ");
                    String customerID = scanner.nextLine();

                    if(customerController.checkID(customerID)){
                        System.out.println("Employee ID already exist!");
                        break;
                    }

                    Customer customer = addNewCustomer(customerID);

                    customerController.addCustomer(customer);
                    break;
                case 3:
                    System.out.print("Enter customer ID want to update: ");
                    String customerIDUpdate = scanner.nextLine();

                    if(!customerController.checkID(customerIDUpdate)){
                        System.out.println("Employee ID does not exist!");
                        break;
                    }

                    Customer customerUpdate = addNewCustomer(customerIDUpdate);

                    customerController.editCustomer(customerUpdate);
                    break;
                case 4:
                    System.out.println("Goodbye customers and see you again!");
                    return;
                default:
                    System.err.println("You entered the wrong choice, please re-enter!");
            }
        } while (true);
    }

    private static Customer addNewCustomer(String customerID) {

        System.out.print("Enter full name customer: ");
        String fullName = scanner.nextLine();

        String dayOfBirth = checkDateOfBirth();

        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter citizen ID: ");
        String citizenID = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter customer type: ");
        String customerType = scanner.nextLine();

        System.out.print("Enter customer address: ");
        String address = scanner.nextLine();

        return new Customer(fullName, dayOfBirth, gender, citizenID, phoneNumber,
                email, customerID, customerType, address);
    }

    private static String checkDateOfBirth() {
        String dayOfBirth;
        do {
            System.out.print("Enter day of birth: ");
            dayOfBirth = scanner.nextLine();

            if (RegexForFurama.validateDateOfBirth(dayOfBirth)) {
                return dayOfBirth;
            } else {
                System.err.println("Day of birth not valid! Re-enter: 12-12-2012.");
            }
        } while (true);
    }
}
