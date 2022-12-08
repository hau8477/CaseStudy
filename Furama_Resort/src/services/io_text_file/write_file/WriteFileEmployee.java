package services.io_text_file.write_file;

import models.persons.inheritance.Employee;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileEmployee {
    public static void write(String path, List<Employee> list) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Employee employee : list) {
            bufferedWriter.write(employee.formatCSV());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
