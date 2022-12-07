package services;

import models.persons.inheritance.Employee;

import java.io.IOException;

public interface IEmployeeService extends IService<Employee>{
    void editEmployee(Employee employee) throws IOException;

    void deleteEmployee(String employeeID) throws IOException;

    boolean checkID(String id) throws IOException;
}
