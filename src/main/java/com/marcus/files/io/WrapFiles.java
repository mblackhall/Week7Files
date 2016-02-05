package com.marcus.files.io;

import org.apache.log4j.Logger;

import java.io.*;

/**
 * @author marcus
 */
public class WrapFiles {

    static final Logger logger = Logger.getLogger(WrapFiles.class);

    public static void main(String[] args) throws IOException {
        WrapFiles wrapFiles = new WrapFiles();
        wrapFiles.writePrintWriter();
        wrapFiles.readFile();

    }

    private void writePrintWriter() {
        File file = new File("mytext.txt");
        PrintWriter pw = null;

        try {
            pw = new PrintWriter(file); // creates the file if it doesn't exist

            pw.println("Now we are talking");
            pw.println("this is easier");

        } catch (FileNotFoundException fe) {
            logger.info("File not found");

        } catch (IOException e) {
            logger.info(e.getMessage());

        } finally {
            pw.flush();
            pw.close();
        }

    }


    private void readFile() throws IOException {

        File file = new File("mytext.txt");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file)); // creates the file if it doesn't exist
            String line = null;
            while ( ( line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException fe) {
            logger.info("File not found");

        } catch (IOException e) {
            logger.info(e.getMessage());

        } finally {
        bufferedReader.close();
        }

    }
}



