package com.marcus.files;

/**
 * @author marcus
 */
public class Tokens {

    public static void main(String[] args) {

        String s = "part1,part2,part3,part4";
        String [] tokens = s.split(",");
        for (String token: tokens){
            System.out.println(token);
        }
        // you can split with a regex

        String [] tokensNos = s.split("\\d");
        for (String token: tokensNos){
            System.out.println(token);
        }

    }
}
