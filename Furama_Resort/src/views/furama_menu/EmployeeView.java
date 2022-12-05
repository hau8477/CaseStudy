package views.furama_menu;

import controllers.EmployeeController;
import models.persons.inheritance.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private static final Scanner scanner = new Scanner(System.in);

    private static final EmployeeController employeeController = new EmployeeController();

    public static void displayEmployeeMenu() {
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
                    List<Employee> employees = employeeController.displayList();

                    for (Employee employee : employees) {
                        System.out.println(employee);
                    }
                    break;
                case 2:
                    System.out.print("Enter full name employee: ");
                    String fullName = scanner.nextLine();

                    System.out.print("Enter day of birth: ");
                    String dayOfBirth = scanner.nextLine();

                    System.out.print("Enter gender: ");
                    String gender = scanner.nextLine();

                    System.out.print("Enter citizen ID: ");
                    String citizenID = scanner.nextLine();

                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();

                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter employee ID: ");
                    String employeeID = scanner.nextLine();

                    System.out.print("Enter level: ");
                    String level = scanner.nextLine();

                    System.out.print("Enter position: ");
                    String position = scanner.nextLine();

                    System.out.print("Enter salary: ");
                    String salary = scanner.nextLine();

                    Employee employee = new Employee(fullName, dayOfBirth, gender, citizenID,
                            phoneNumber, email, employeeID, level, position, salary);

                    employeeController.addEmployee(employee);
                    break;
                case 3:
                    System.out.print("Enter employee ID want to delete: ");
                    String employeeIDDelete = scanner.nextLine();

                    employeeController.deleteEmployee(employeeIDDelete);
                    break;
                case 4:
                    System.out.print("Enter employee ID want to update: ");
                    String employeeIDUpdate = scanner.nextLine();

                    System.out.print("Enter new full name employee: ");
                    String fullNameUpdate = scanner.nextLine();

                    System.out.print("Enter new day of birth: ");
                    String dayOfBirthUpdate = scanner.nextLine();

                    System.out.print("Enter new gender: ");
                    String genderUpdate = scanner.nextLine();

                    System.out.print("Enter new citizen ID: ");
                    String citizenIDUpdate = scanner.nextLine();

                    System.out.print("Enter new phone number: ");
                    String phoneNumberUpdate = scanner.nextLine();

                    System.out.print("Enter new email: ");
                    String emailUpdate = scanner.nextLine();

                    System.out.print("Enter new level: ");
                    String levelUpdate = scanner.nextLine();

                    System.out.print("Enter new position: ");
                    String positionUpdate = scanner.nextLine();

                    System.out.print("Enter new salary: ");
                    String salaryUpdate = scanner.nextLine();

                    Employee employeeUpdate = new Employee(fullNameUpdate, dayOfBirthUpdate, genderUpdate, citizenIDUpdate,
                            phoneNumberUpdate, emailUpdate, employeeIDUpdate, levelUpdate, positionUpdate, salaryUpdate);

                    employeeController.editEmployee(employeeUpdate);
                    break;
                case 5:
                    System.out.println("Goodbye customers and see you again!");

                    employeeController.returnMainMenu();
                    break;
                default:
                    System.err.println("You entered the wrong choice, please re-enter!");
            }
        } while (choice != 5);
    }
}
