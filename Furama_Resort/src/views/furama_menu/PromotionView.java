package views.furama_menu;

import java.util.Scanner;

public class PromotionView {
    private static final Scanner scanner = new Scanner(System.in);
    public static void displayPromotionMenu(){
        int choice = 0;

        do {
            System.out.print("---------------Promotion Management---------------\n" +
                    "1. Display list customers use service.\n" +
                    "2. Display list customers get voucher.\n" +
                    "3. Return main menu.\n" +
                    "Please enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.println("Goodbye customers and see you again!");
                    return;
                default:
                    System.err.println("You entered the wrong choice, please re-enter!");
            }
        } while (true);
    }
}
