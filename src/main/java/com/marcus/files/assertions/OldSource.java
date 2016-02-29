package com.marcus.files.assertions;

/**
 * This source used assert as a variable
 * @author marcus
 */
public class OldSource {

    public static void main(String[] args) {
        new OldSource().tester(5);

    }


    private void tester(int i) {
   // not allowed with java 1.4 and later but can compile if javac -source 1.3 is used

   //     boolean assert = true;



    }

}
