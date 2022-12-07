package controllers;

import models.persons.inheritance.Employee;
import services.IEmployeeService;
import services.impl.EmployeeService;

import java.io.IOException;
import java.util.List;

public class EmployeeController {
    private final IEmployeeService employeeService = new EmployeeService();

    public List<Employee> displayList(){
        try {
            return this.employeeService.getList();
        } catch (IOException e) {
            System.err.println("Error");
            return null;
        }
    }

    public void addEmployee(Employee employee) {
        try {
            this.employeeService.addNew(employee);
        } catch (IOException e) {
            System.err.println("Error");
        }
    }

    public void deleteEmployee(String employeeID) {
        try {
            this.employeeService.deleteEmployee(employeeID);
        } catch (IOException e) {
            System.err.println("Error");
        }
    }

    public void editEmployee(Employee employee){
        try {
            this.employeeService.editEmployee(employee);
        } catch (IOException e) {
            System.err.println("Error");
        }
    }

    public boolean checkID(String id){
        try {
            return employeeService.checkID(id);
        } catch (IOException e) {
            System.err.println("Error");
            return false;
        }
    }
}
