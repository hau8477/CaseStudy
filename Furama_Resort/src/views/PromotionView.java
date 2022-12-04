package views;

import java.util.Scanner;

public class PromotionView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayPromotionMenu(){
        int choice;

        do {
            System.out.print("---------------Promotion Management---------------\n" +
                    "1. Display list customers use service.\n" +
                    "2. Display list customers get voucher.\n" +
                    "3. Return main menu.\n" +
                    "Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Goodbye customers and see you again!");
                    break;
                default:
                    System.err.println("You entered the wrong choice, please re-enter!");
            }
        } while (choice != 3);

        FuramaView.displayMainMenu();
    }
}
