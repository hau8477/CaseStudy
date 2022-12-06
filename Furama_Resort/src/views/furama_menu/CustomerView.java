package views.furama_menu;

import controllers.CustomerController;
import models.persons.inheritance.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private static final Scanner scanner = new Scanner(System.in);

    private static final CustomerController customerController = new CustomerController();
    public static void displayCustomerMenu(){
        int choice;

        do {
            System.out.print("---------------Customer Management---------------\n" +
                    "1. Display list customers.\n" +
                    "2. Add new customer.\n" +
                    "3. Edit customer.\n" +
                    "4. Return main menu.\n" +
                    "Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    List<Customer> customers = customerController.displayList();

                    for (Customer customer:customers) {
                        System.out.println(customer);
                    }
                    break;
                case 2:
                    System.out.print("Enter customer ID: ");
                    Customer customer = addNewCustomer();

                    customerController.addCustomer(customer);
                    break;
                case 3:
                    System.out.print("Enter customer ID want to update: ");
                    Customer customerUpdate = addNewCustomer();

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

    private static Customer addNewCustomer(){
        String customerID = scanner.nextLine();

        System.out.print("Enter full name customer: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter day of birth: ");
        String dayOfBirth = scanner.nextLine();

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

        return new Customer(fullName,dayOfBirth,gender,citizenID,phoneNumber,
                email,customerID,customerType,address);
    }
}
