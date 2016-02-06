package com.marcus.files.regex;

import java.util.Scanner;

/**
 * @author marcus
 */
public class ScannerSearch {

    public static void main(String[] args) {
        String str = null;
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.println(str = scanner.findInLine("\\d+"));

        } while (str != null);

    }
}
