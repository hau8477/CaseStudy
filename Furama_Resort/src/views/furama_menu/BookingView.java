package views.furama_menu;

import controllers.BookingController;

import java.util.Scanner;

public class BookingView {
    private static final Scanner scanner = new Scanner(System.in);

    private static final BookingController bookingController = new BookingController();
    public static void displayBookingMenu(){
        int choice = 0;

        do {
            System.out.print("1. Add new booking.\n" +
                    "2. Display list booking.\n" +
                    "3. Return main menu.\n" +
                    "Please enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }

            switch (choice) {
                case 1:
                    bookingController.addNew(null);
                    break;
                case 2:
                    bookingController.getList();
                    break;
                case 3:
                    System.out.println("Goodbye customers and see you again!");
                    return;
                default:
                    System.err.println("You entered the wrong choice, please re-enter!");
            }
        } while (true);
    }
}
