package services.io.text.file.write_file.impl;

import models.persons.inheritance.Employee;
import services.io.text.file.write_file.IWriteFileEmployee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileEmployee implements IWriteFileEmployee {
    @Override
    public void write(String path, List<Employee> list) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Employee employee:list) {
            bufferedWriter.write(employee.formatCSV());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
