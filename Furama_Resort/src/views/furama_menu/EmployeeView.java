package views.furama_menu;

import controllers.EmployeeController;
import libs.RegexForFurama;
import models.persons.inheritance.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private static final Scanner scanner = new Scanner(System.in);

    private static final EmployeeController employeeController = new EmployeeController();

    public static void displayEmployeeMenu() {
        int choice = 0;

        do {
            System.out.print("---------------Employee Management---------------\n" +
                    "1. Display list employees.\n" +
                    "2. Add new employee.\n" +
                    "3. Delete employee.\n" +
                    "4. Edit employee.\n" +
                    "5. Return main menu.\n" +
                    "Please enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }

            switch (choice) {
                case 1:
                    List<Employee> employees = employeeController.getListEmployee();

                    for (Employee employee : employees) {
                        System.out.println(employee);
                    }
                    break;
                case 2:
                    System.out.print("Enter employee ID: ");
                    Employee employee = addNewEmployee();

                    employeeController.addEmployee(employee);
                    break;
                case 3:
                    System.out.print("Enter employee ID want to delete: ");
                    String employeeIDDelete = scanner.nextLine();

                    employeeController.deleteEmployee(employeeIDDelete);
                    break;
                case 4:
                    System.out.print("Enter employee ID want to update: ");
                    Employee employeeUpdate = addNewEmployee();

                    employeeController.editEmployee(employeeUpdate);
                    break;
                case 5:
                    System.out.println("Goodbye customers and see you again!");
                    return;
                default:
                    System.err.println("You entered the wrong choice, please re-enter!");
            }
        } while (true);
    }

    private static Employee addNewEmployee() {
        String employeeID = scanner.nextLine();

        System.out.print("Enter full name employee: ");
        String fullName = scanner.nextLine();

        String dayOfBirth = checkDateOfBirth();

        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter citizen ID: ");
        String citizenID = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter level: ");
        String level = scanner.nextLine();

        System.out.print("Enter position: ");
        String position = scanner.nextLine();

        System.out.print("Enter salary: ");
        String salary = scanner.nextLine();

        return new Employee(fullName, dayOfBirth, gender, citizenID,
                phoneNumber, email, employeeID, level, position, salary);
    }

    private static String checkDateOfBirth() {
        String dayOfBirth;
        do {
            System.out.print("Enter day of birth: ");
            dayOfBirth = scanner.nextLine();

            if (RegexForFurama.validateDateOfBirth(dayOfBirth)) {
                return dayOfBirth;
            } else {
                System.err.println("Day of birth not valid! Re-enter: 12-12-2012.");
            }
        } while (true);
    }
}