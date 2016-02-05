package com.marcus.files.regex;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author marcus
 */
public class ConsoleMatcher {

    public static void main(String[] args) {

        Console console = System.console();
        boolean more = true;
        String regex, search;
        while (true) {
            regex = console.readLine("%-15s", "Enter regex : ");
            search = console.readLine("%-15s", "Search text :");
            if (search.equals("END")) break;

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(search);
            System.out.print("Found at : ");
            while (matcher.find()) {
                System.out.print("Start: " + matcher.start() + " " + " Group: " + matcher.group() + " ");;
            }
            System.out.println(" ");

        }


    }
}
