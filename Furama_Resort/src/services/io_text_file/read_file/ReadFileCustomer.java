package services.io_text_file.read_file;

import models.persons.inheritance.Customer;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadFileCustomer{
    public static List<Customer> readFile(String path) throws IOException {
        List<Customer> customers = new LinkedList<>();
        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line;
        while ((line = bufferedReader.readLine()) != null){
            String[] splitLine = line.split(",");
            Customer customer = new Customer(splitLine);
            customers.add(customer);
        }

        bufferedReader.close();
        return customers;
    }
}
