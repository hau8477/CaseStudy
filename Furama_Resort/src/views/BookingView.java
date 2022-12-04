package views;

import java.util.Scanner;

public class BookingView {
    private static final Scanner scanner = new Scanner(System.in);
    public static void displayBookingMenu(){
        int choice;

        do {
            System.out.print("---------------Booking Management---------------\n" +
                    "1. Add new booking.\n" +
                    "2. Display list booking.\n" +
                    "3. Return main menu.\n" +
                    "Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                case 2:
                case 3:
            }
        } while (choice != 3);

        FuramaView.displayMainMenu();
    }
}
