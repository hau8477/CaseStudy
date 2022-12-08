package views.furama_menu.facility_view;

import controllers.FacilityController;
import libs.RegexForFurama;
import models.facilitys.Facility;
import models.facilitys.inheritance.Room;
import models.facilitys.inheritance.Villa;

import java.util.Scanner;

public class FacilityAddNewMenu {
    private static final Scanner scanner = new Scanner(System.in);

    private static final FacilityController facilityController = new FacilityController();

    public static void displayMenu() {
        int choice = 0;
        int countOfUsesVilla = 0;
        int countOfUsesRoom = 0;

        do {
            System.out.print("---------------Service---------------\n" +
                    "1. Add New Villa.\n" +
                    "2. Add New Room.\n" +
                    "3. Back to menu.\n" +
                    "Please enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }

            switch (choice) {
                case 1:
                    String serviceIDVilla;
                    do {
                        System.out.print("Enter service ID: ");
                        serviceIDVilla = scanner.nextLine();

                        if (RegexForFurama.validateIDServiceVilla(serviceIDVilla)) {
                            break;
                        } else {
                            System.err.println("Service ID not valid! Re-enter: ex: SVVL-0001");
                        }
                    } while (true);

                    System.out.print("Enter name service: ");
                    String nameServiceVilla = checkNameService();

                    System.out.print("Enter area use: ");
                    String useAreaVilla = checkAreaUse();


                    String rentCostVilla = checkRentCost();

                    String maxPersonVilla = checkMaxPerson();

                    System.out.print("Enter rental type: ");
                    String rentalTypeVilla = checkNameService();

                    System.out.print("Enter standard room: ");
                    String roomStandard = checkNameService();

                    System.out.print("Enter area pool: ");
                    String poolArea = checkAreaUse();

                    String floorNumbers;
                    do {
                        System.out.print("Enter number floor: ");
                        floorNumbers = scanner.nextLine();

                        if (RegexForFurama.validatePositiveInteger(floorNumbers)) {
                            break;
                        } else {
                            System.err.println("Number floor not valid! Number floor > 0.");
                        }
                    } while (true);

                    Facility villa = new Villa(serviceIDVilla, nameServiceVilla, useAreaVilla, rentCostVilla, maxPersonVilla,
                            rentalTypeVilla, roomStandard,
                            poolArea, floorNumbers);
                    countOfUsesVilla++;
                    facilityController.addNewFacility(villa, countOfUsesVilla);
                    break;
                case 2:
                    String serviceIDRoom;
                    do {
                        System.out.print("Enter service ID: ");
                        serviceIDRoom = scanner.nextLine();

                        if (RegexForFurama.validateIDServiceRoom(serviceIDRoom)) {
                            break;
                        } else {
                            System.err.println("Service ID not valid! Re-enter: ex: SVRO-0001");
                        }
                    } while (true);

                    System.out.print("Enter name service: ");
                    String nameServiceRoom = checkNameService();

                    System.out.print("Enter area use: ");
                    String useAreaRoom = checkAreaUse();

                    String rentCostRoom = checkRentCost();

                    String maxPersonRoom = checkMaxPerson();

                    System.out.print("Enter rental type: ");
                    String rentalTypeRoom = checkNameService();

                    System.out.print("Enter service included free: ");
                    String freeServiceIncludedRoom = scanner.nextLine();

                    Facility room = new Room(serviceIDRoom, nameServiceRoom, useAreaRoom, rentCostRoom, maxPersonRoom,
                            rentalTypeRoom, freeServiceIncludedRoom);
                    countOfUsesRoom++;
                    facilityController.addNewFacility(room, countOfUsesRoom);
                    break;
                case 3:
                    System.out.println("Goodbye customers and see you again!");
                    return;
                default:
                    System.err.println("You entered the wrong choice, please re-enter!");
            }
        } while (true);
    }

    private static String checkRentCost() {
        String rentCost;
        do {
            System.out.print("Enter cost rent: ");
            rentCost = scanner.nextLine();

            if (RegexForFurama.validatePositiveNumber(rentCost)) {
                return rentCost;
            } else {
                System.err.println("Cost rent not valid! Cost rent must be positive! Re-enter: ex: 2.0");
            }
        } while (true);
    }

    private static String checkMaxPerson() {
        String maxPerson;
        do {
            System.out.print("Enter maximum person: ");
            maxPerson = scanner.nextLine();

            if (RegexForFurama.validateMaxPeople(maxPerson)) {
                return maxPerson;
            } else {
                System.err.println("Invalid of peoples! 0 < Peoples < 20.");
            }
        } while (true);
    }

    private static String checkNameService() {
        String rentalType;
        do {
            rentalType = scanner.nextLine();

            if (RegexForFurama.validateNameService(rentalType)) {
                return rentalType;
            } else {
                System.err.println("Rental type not valid! Re-enter: ex: Abc.");
            }
        } while (true);
    }

    private static String checkAreaUse(){
        String areaUse;
        do {
            areaUse = scanner.nextLine();

            if (RegexForFurama.validateDoubleNumber(areaUse)) {
                return areaUse;
            } else {
                System.err.println("Not valid! Area > 30.0! Re-enter: ex: 30.0 ");
            }
        } while (true);
    }
}
