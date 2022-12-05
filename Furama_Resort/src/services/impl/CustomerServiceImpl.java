package services.impl;

import models.persons.inheritance.Customer;
import services.ICustomerService;
import views.FuramaView;

import java.util.LinkedList;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private static final List<Customer> customers = new LinkedList<>();

    @Override
    public void editCustomer(Customer customer) {
        for (Customer customer1:customers) {
            if(customer1.getCustomerID().equals(customer.getCustomerID())){
                customer1.setAll(customer.getFullName(),customer.getDayOfBirth(),customer.getGender(),
                        customer.getCitizenID(),customer.getPhoneNumber(),customer.getEmail());
                customer1.setCustomerID(customer.getCustomerID());
                customer1.setCustomerType(customer.getCustomerType());
                customer1.setAddress(customer.getAddress());
                break;
            }
        }
    }

    @Override
    public void addNew(Customer object) {
        for (Customer customer: customers) {
            if (customer.getCustomerID().equals(object.getCustomerID())){
                return;
            }
        }
        customers.add(object);
    }

    @Override
    public List<Customer> displayList() {
        return customers;
    }

    @Override
    public void returnMainMenu() {
        FuramaView.displayMainMenu();
    }
}
