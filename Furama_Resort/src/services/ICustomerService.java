package services;

import models.persons.inheritance.Customer;

public interface ICustomerService extends IService<Customer>{
    void editCustomer(Customer customer);

    boolean checkID(String id);
}
