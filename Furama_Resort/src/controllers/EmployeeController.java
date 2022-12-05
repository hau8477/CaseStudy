package controllers;

import models.persons.inheritance.Employee;
import services.IEmployeeService;
import services.impl.EmployeeServiceImpl;

import java.util.List;

public class EmployeeController {
    private final IEmployeeService employeeService = new EmployeeServiceImpl();

    public List<Employee> displayList(){
        return this.employeeService.getList();
    }

    public void addEmployee(Employee employee) {
        this.employeeService.addNew(employee);
    }

    public void deleteEmployee(String employeeID) {
        this.employeeService.deleteEmployee(employeeID);
    }

    public void editEmployee(Employee employee){
        this.employeeService.editEmployee(employee);
    }

    public void returnMainMenu(){
        this.employeeService.returnMainMenu();
    }
}
