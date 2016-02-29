package com.marcus.files.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author marcus
 */

class MyLine {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    MyLine(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}

public class ReadCsv {

    List<MyLine> lines = new ArrayList<>();


    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("File name required");
            System.exit(0);
        }

        Path path = Paths.get(args[0]);

        ReadCsv readCsv = new ReadCsv();
        readCsv.printCsv(path);
        readCsv.printDetails();


    }

    private void printDetails() {

        System.out.printf("%-15s %-15s%n","First Name","Last Name");
        System.out.printf("%-15s %-15s%n","==========","============");
        for(MyLine line: lines ){
            System.out.printf("%-15s %-15s%n",line.getFirstName(),line.getLastName());
        }
    }

    private void printCsv(Path path) {

        String line;
        try (BufferedReader br = Files.newBufferedReader(path, Charset.forName("UTF-8"))) {
            int noLines = 0;
            while ((line = br.readLine()) != null) {
                noLines ++;
                if (noLines == 1){
                    continue;
                }
                String[] values = line.split(",");
                lines.add(new MyLine(values[0], values[1]));
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
            ;
        }


    }
}
