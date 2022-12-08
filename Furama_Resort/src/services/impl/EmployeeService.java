package services.impl;

import exception.NotFoundException;
import models.persons.inheritance.Employee;
import services.IEmployeeService;
import services.io_text_file.read_file.ReadFileEmployee;
import services.io_text_file.write_file.WriteFileEmployee;

import java.io.IOException;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    private static final String FILE_EMPLOYEE = "src/data/persons/employee.csv";

    @Override
    public void editEmployee(Employee employee) throws IOException {
        List<Employee> employees = ReadFileEmployee.readFile(FILE_EMPLOYEE);

        if (!checkID(employee.getEmployeeID())) {
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

        WriteFileEmployee.write(FILE_EMPLOYEE, employees);
    }

    @Override
    public void deleteEmployee(String employeeID) throws IOException {
        List<Employee> employees = ReadFileEmployee.readFile(FILE_EMPLOYEE);

        if (!checkID(employeeID)) {
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
        WriteFileEmployee.write(FILE_EMPLOYEE, employees);
    }

    @Override
    public void addNew(Employee object) throws IOException {
        List<Employee> employees = ReadFileEmployee.readFile(FILE_EMPLOYEE);

        if (checkID(object.getEmployeeID())) {
            return;
        }

        employees.add(object);

        WriteFileEmployee.write(FILE_EMPLOYEE, employees);
    }

    @Override
    public List<Employee> getList() throws IOException {
        return ReadFileEmployee.readFile(FILE_EMPLOYEE);
    }

    public boolean checkID(String id){
        List<Employee> employees = null;

        try {
            employees = ReadFileEmployee.readFile(FILE_EMPLOYEE);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        if (employees == null) {
            try {
                throw new NotFoundException("File empty");
            } catch (NotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        for (Employee employee : employees) {
            if (id.equals(employee.getEmployeeID())) {
                return true;
            }
        }

        try {
            WriteFileEmployee.write(FILE_EMPLOYEE, employees);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
