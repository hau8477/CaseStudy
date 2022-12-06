package services.impl;

import models.persons.inheritance.Customer;
import models.persons.inheritance.Employee;
import services.ICustomerService;

import java.util.LinkedList;
import java.util.List;

public class CustomerService implements ICustomerService {
    private static final List<Customer> customers = new LinkedList<>();

    @Override
    public void editCustomer(Customer customer) {
        if(!checkID(customer.getCustomerID())){
            System.err.println("Employee ID does not exist!");
            return;
        }
        for (Customer customer1:customers) {
            if(customer1.getCustomerID().equals(customer.getCustomerID())){
                customer1.setAll(customer.getFullName(),customer.getDayOfBirth(),customer.getGender(),
                        customer.getCitizenID(),customer.getPhoneNumber(),customer.getEmail());
                customer1.setCustomerType(customer.getCustomerType());
                customer1.setAddress(customer.getAddress());
                break;
            }
        }
    }

    @Override
    public void addNew(Customer object) {
        if(checkID(object.getCustomerID())){
            System.err.println("Employee ID already exist!");
            return;
        }
        customers.add(object);
    }

    @Override
    public List<Customer> getList() {
        return customers;
    }

    public boolean checkID(String id){
        for (Customer customer : customers) {
            if(id.equals(customer.getCustomerID())){
                return true;
            }
        }
        return false;
    }
}
