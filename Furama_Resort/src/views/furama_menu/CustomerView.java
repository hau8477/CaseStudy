package views.furama_menu;

import views.FuramaView;

import java.util.Scanner;

public class CustomerView {
    private static final Scanner scanner = new Scanner(System.in);
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
                case 2:
                case 3:
                case 4:
                    System.out.println("Goodbye customers and see you again!");
                    break;
                default:
                    System.err.println("You entered the wrong choice, please re-enter!");
            }
        } while (choice != 4);

        FuramaView.displayMainMenu();
    }
}
