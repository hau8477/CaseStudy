package models.persons.inheritance;

import models.persons.Person;

public class Employee extends Person {
    private String employeeID;
    private String level;
    private String position;
    private String salary;

    public Employee(){

    }

    public Employee(String fullName, String dayOfBirth, String gender, String citizenID, String phoneNumber,
                    String email, String employeeID, String level, String position, String salary) {
        super(fullName, dayOfBirth, gender, citizenID, phoneNumber, email);
        this.employeeID = employeeID;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String[] array){
        super(array);
        this.employeeID = array[6];
        this.level = array[7];
        this.position = array[8];
        this.salary = array[9];
    }

    public String formatCSV(){
        return getFullName() + "," + getDayOfBirth() + "," + getGender() + "," + getCitizenID() + "," + getPhoneNumber()
                + "," + getEmail() + "," + employeeID + "," + level + "," + position + "," + salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "employeeID='" + employeeID + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
