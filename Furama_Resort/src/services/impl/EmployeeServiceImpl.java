package services.impl;

import models.persons.inheritance.Employee;
import services.IEmployeeService;
import views.FuramaView;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private final List<Employee> employees = new ArrayList<>();

    @Override
    public void editEmployee(Employee employee) {
        for (Employee employee1 : employees) {
            if (employee1.getEmployeeID().equals(employee.getEmployeeID())) {
                employee1.setFullName(employee.getFullName());
                employee1.setDayOfBirth(employee.getDayOfBirth());
                employee1.setPhoneNumber(employee.getPhoneNumber());
                employee1.setEmail(employee.getEmail());
                employee1.setLevel(employee.getLevel());
                employee1.setPosition(employee.getPosition());
                employee1.setSalary(employee.getSalary());
                break;
            }
        }
    }

    @Override
    public void deleteEmployee(String employeeID) {
        Employee employeeDelete = null;

        for (Employee employee : employees) {
            if (employee.getEmployeeID().equals(employeeID)) {
                employeeDelete = employee;
                break;
            }
        }
        if (employeeDelete == null) {
            return;
        }

        employees.remove(employeeDelete);
    }

    @Override
    public void addNew(Employee object) {
        for (Employee employee : employees) {
            if (employee.getEmployeeID().equals(object.getEmployeeID())) {
                return;
            }
        }
        employees.add(object);
    }

    @Override
    public List<Employee> displayList() {
        return employees;
    }

    @Override
    public void returnMainMenu() {
        FuramaView.displayMainMenu();
    }
}
