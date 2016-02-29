package com.marcus.files.io;

import org.apache.log4j.Logger;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author marcus
 */
public class ReadWrite {

    Logger logger = Logger.getLogger(ReadWrite.class);

    public static void main(String[] args) throws IOException {
        new ReadWrite().writeThenRead();
    }

    private void writeThenRead() throws IOException {
        String fileName = "myfile.txt";
        char[] in = new char[50];
        FileWriter writer = null;
        FileReader reader = null;
        try {
            writer = new FileWriter("myfile.txt");

            writer.write("Dulce est decorum\nest prop patria mori");
            writer.flush();
            writer.close();

            reader = new FileReader(fileName);
            reader.read(in);

           for (char c:in){
               if (Character.MIN_VALUE == c){
                   continue;
               }
               System.out.print(c);
           }



            reader.close();


        } catch (IOException e) {
            logger.error("File read write error " + e.getMessage());
            throw e;
        }


    }

}
