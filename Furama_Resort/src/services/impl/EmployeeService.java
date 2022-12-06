package services.impl;

import models.persons.inheritance.Customer;
import models.persons.inheritance.Employee;
import services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    private final List<Employee> employees = new ArrayList<>();

    @Override
    public void editEmployee(Employee employee) {
        if (!checkID(employee.getEmployeeID())){
            System.err.println("Employee ID does not exist!");
            return;
        }
        for (Employee employee1 : employees) {
            if (employee1.getEmployeeID().equals(employee.getEmployeeID())) {
                employee1.setAll(employee.getFullName(), employee.getDayOfBirth(), employee.getGender(),
                        employee.getCitizenID(),
                        employee.getPhoneNumber(), employee.getEmail());
                employee1.setLevel(employee.getLevel());
                employee1.setPosition(employee.getPosition());
                employee1.setSalary(employee.getSalary());
                break;
            }
        }
    }

    @Override
    public void deleteEmployee(String employeeID) {
        if (!checkID(employeeID)){
            System.err.println("Employee ID does not exist!");
            return;
        }
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
        if (checkID(object.getEmployeeID())) {
            System.err.println("Employee ID already exists!");
            return;
        }
        employees.add(object);
    }

    @Override
    public List<Employee> getList() {
        return employees;
    }

    public boolean checkID(String id) {
        for (Employee employee : employees) {
            if (id.equals(employee.getEmployeeID())) {
                return true;
            }
        }
        return false;
    }
}
