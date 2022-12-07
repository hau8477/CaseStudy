package services.io.text.file.write_file.impl;

import models.persons.inheritance.Customer;
import services.io.text.file.write_file.IWriteFileCustomer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileCustomer implements IWriteFileCustomer {
    @Override
    public void write(String path, List<Customer> list) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Customer customer : list) {
            bufferedWriter.write(customer.formatCSV());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
