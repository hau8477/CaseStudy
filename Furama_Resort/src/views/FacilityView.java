package views;

import java.util.Scanner;

public class FacilityView {
    private static final Scanner scanner = new Scanner(System.in);
    public static void displayFacilityMenu(){
        int choice;

        do {
            System.out.print("---------------Facility Management---------------\n" +
                    "1. Display list facility.\n" +
                    "2. Add new facility.\n" +
                    "3. Display list facility maintenance.\n" +
                    "4. Return main menu.\n" +
                    "Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
            }
        } while (choice != 4);

        FuramaView.displayMainMenu();
    }
}
