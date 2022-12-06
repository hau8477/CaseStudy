package services;

import models.persons.inheritance.Employee;

public interface IEmployeeService extends IService<Employee>{
    void editEmployee(Employee employee);

    void deleteEmployee(String employeeID);

    boolean checkID(String id);
}
