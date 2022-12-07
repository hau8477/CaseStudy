package services;

import models.persons.inheritance.Customer;

import java.io.IOException;

public interface ICustomerService extends IService<Customer>{
    void editCustomer(Customer customer) throws IOException;

    boolean checkID(String id) throws IOException;
}
