package controllers;

import models.persons.inheritance.Customer;
import services.ICustomerService;
import services.impl.CustomerService;

import java.io.IOException;
import java.util.List;

public class CustomerController {
    private static final ICustomerService customerService = new CustomerService();

    public List<Customer> getListCustomer() {
        try {
            return customerService.getList();
        } catch (IOException e) {
            System.err.println("File empty.");
            return null;
        }
    }

    public void addCustomer(Customer customer) {
        try {
            customerService.addNew(customer);
        } catch (IOException e) {
            System.err.println("File empty.");
        }
    }

    public void editCustomer(Customer customer) {
        try {
            customerService.editCustomer(customer);
        } catch (IOException e) {
            System.err.println("File empty.");
        }
    }

    public boolean checkID(String id){
        try {
            return customerService.checkID(id);
        } catch (IOException e) {
            System.out.println("Id not valid.");
            return false;
        }
    }
}
