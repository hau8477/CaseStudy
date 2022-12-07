package services.impl;

import models.persons.inheritance.Customer;
import services.ICustomerService;
import services.io.text.file.read_file.ReadFileCustomer;
import services.io.text.file.write_file.WriteFileCustomer;

import java.io.IOException;
import java.util.List;

public class CustomerService implements ICustomerService {

    private static final String FILE_CUSTOMER = "src/data/persons/customer.csv";

    @Override
    public void editCustomer(Customer customer) throws IOException {
        List<Customer> customers = ReadFileCustomer.readFile(FILE_CUSTOMER);

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

        WriteFileCustomer.write(FILE_CUSTOMER,customers);
    }

    @Override
    public void addNew(Customer object) throws IOException {
        List<Customer> customers = ReadFileCustomer.readFile(FILE_CUSTOMER);

        if(checkID(object.getCustomerID())){
            System.err.println("Employee ID already exist!");
            return;
        }

        customers.add(object);

        WriteFileCustomer.write(FILE_CUSTOMER,customers);
    }

    @Override
    public List<Customer> getList() throws IOException {
        return ReadFileCustomer.readFile(FILE_CUSTOMER);
    }

    public boolean checkID(String id) throws IOException {
        List<Customer> customers = ReadFileCustomer.readFile(FILE_CUSTOMER);

        for (Customer customer : customers) {
            if(id.equals(customer.getCustomerID())){
                return true;
            }
        }

        WriteFileCustomer.write(FILE_CUSTOMER,customers);
        return false;
    }
}
