package services.io.text.file.read_file.impl;

import models.persons.inheritance.Employee;
import services.io.text.file.read_file.IReadFileEmployee;

import java.io.*;
import java.util.ArrayList;

import java.util.List;

public class ReadFileEmployee implements IReadFileEmployee {
    @Override
    public List<Employee> readFile(String path) throws IOException {
        List<Employee> employees = new ArrayList<>();
        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line;
        while ((line = bufferedReader.readLine()) != null){
            String[] splitLine = line.split(",");
            Employee employee = new Employee(splitLine);
            employees.add(employee);
        }

        bufferedReader.close();
        return employees;
    }
}
