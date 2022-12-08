package services.io_text_file.read_file;

import models.persons.inheritance.Employee;

import java.io.*;
import java.util.ArrayList;

import java.util.List;

public class ReadFileEmployee{
    public static List<Employee> readFile(String path) throws IOException {
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
