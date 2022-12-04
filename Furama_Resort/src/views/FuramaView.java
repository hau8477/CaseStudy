package views;

import java.util.Scanner;

public class FuramaView {
    private final Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        int choice;

        do {
            System.out.print("---------------Furama Resort---------------\n" +
                    "---------------------Welcome to Furama Resort---------------------" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit\n" +
                    "Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(1);
                default:
                    System.err.println("You entered the wrong choice, please re-enter!");
            }
        } while (true);
    }
}
