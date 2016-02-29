package com.marcus.files.assertions;

/**
 * Run with java option -ea or -da or default (assertions off
 *
 * @author marcus
 */
public class Examples {

    public static void main(String[] args) {
        System.out.println(" factorial is " + new Examples().factorial(5));
        System.out.println(" factorial is " + new Examples().factorial(2));
        System.out.println(" factorial is " + new Examples().factorial(-1));
    }

    private long factorial(int n) {

        // assert says if the condition is false throw an Assertion error
        // an assertion is a subclass of error see...
        // @link https://docs.oracle.com/javase/7/docs/api/java/lang/AssertionError.html

        assert n >= 0 : "Factorial applies only to positive no's";

        if (n == 0 || n == 1) return 1;

        long result = n;

        for (int i = n - 1; i > 1; i--) {
            result *= i;

        }
        return result;
    }

}
