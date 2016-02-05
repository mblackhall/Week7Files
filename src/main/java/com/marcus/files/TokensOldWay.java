package com.marcus.files;

import java.util.StringTokenizer;

/**
 * @author marcus
 */
public class TokensOldWay {

    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("here,is,a,string",",");

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

       // or can use without a 2nd argument then default is blank


    }
}
