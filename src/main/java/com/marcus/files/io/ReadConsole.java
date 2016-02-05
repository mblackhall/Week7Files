package com.marcus.files.io;

import java.io.Console;
import java.util.Arrays;

/**
 * @author marcus
 */
public class ReadConsole {

    public static final String PASSWORD = "ABC";
    public static void main(String[] args) {

        Console console = System.console();
        if ( console == null) {
            throw new NullPointerException("Console not available here");
        }
        boolean correct = false;
        char []c  ;
        while ( !correct ){
            c = console.readPassword("%s", "pw: ") ;
            System.out.println(c);
            if ( Arrays.equals(c,PASSWORD.toCharArray())) correct = true;
        }

        while (true){

          String line =  console.readLine();
            if (line.isEmpty()) break;
            System.out.println("echo *** " + line);
        }

    }


}
