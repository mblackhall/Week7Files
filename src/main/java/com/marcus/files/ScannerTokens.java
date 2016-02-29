package com.marcus.files;

import java.util.Scanner;

/**
 * @author marcus
 */
public class ScannerTokens {

    public static void main(String[] args) {
        String in = "here is a string";

        // ty with resources will close the scanner for you...
        try (Scanner scan = new Scanner(in)) {
            scan.useDelimiter("\\s");
            while (scan.hasNext()) {
                System.out.println(scan.next());
            }

            Scanner scanner = new Scanner(System.in);


            while (scanner.hasNextInt()) {
                System.out.println("echo ** " + scanner.nextInt());
            }

        }


    }

}
