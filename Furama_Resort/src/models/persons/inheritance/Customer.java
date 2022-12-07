package models.persons.inheritance;

import models.persons.Person;

public class Customer extends Person {
    private String customerID;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String fullName, String dayOfBirth, String gender, String citizenID, String phoneNumber,
                    String email, String customerID, String customerType, String address) {
        super(fullName, dayOfBirth, gender, citizenID, phoneNumber, email);
        this.customerID = customerID;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String[] array) {
        super(array);
        this.customerID = array[6];
        this.customerType = array[7];
        this.address = array[8];
    }
    public String formatCSV(){
        return getFullName() + "," + getDayOfBirth() + "," + getGender() + "," + getCitizenID() + "," + getPhoneNumber()
                + "," + getEmail() + "," + customerID + "," + customerType + "," + address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "customerID='" + customerID + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
