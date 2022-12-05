package controllers;

import models.persons.inheritance.Customer;
import services.ICustomerService;
import services.impl.CustomerServiceImpl;
import views.FuramaView;

import java.util.List;

public class CustomerController {
    private static final ICustomerService customerService = new CustomerServiceImpl();

    public List<Customer> displayList(){
        return customerService.getList();
    }

    public void addCustomer(Customer customer){
        customerService.addNew(customer);
    }

    public void editCustomer(Customer customer){
        customerService.editCustomer(customer);
    }

    public void returnMainMenu(){
        FuramaView.displayMainMenu();
    }
}
