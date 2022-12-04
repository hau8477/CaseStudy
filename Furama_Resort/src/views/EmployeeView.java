package views;

import java.util.Scanner;

public class EmployeeView {
    private static final Scanner scanner = new Scanner(System.in);
    public static void displayEmployeeMenu(){
        int choice;

        do {
            System.out.print("---------------Employee Management---------------\n" +
                    "1. Display list employees.\n" +
                    "2. Add new employee.\n" +
                    "3. Delete employee.\n" +
                    "4. Edit employee.\n" +
                    "5. Return main menu.\n" +
                    "Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Goodbye customers and see you again!");
                    break;
                default:
                    System.err.println("You entered the wrong choice, please re-enter!");
            }
        } while (choice != 5);
        FuramaView.displayMainMenu();
    }
}
