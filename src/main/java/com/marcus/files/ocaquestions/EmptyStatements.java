package com.marcus.files.ocaquestions;

/**
 * @author marcus
 */
public class EmptyStatements {

    public static void main(String[] args) {

        // allowed but useless
        switch(1){

        }
        // allowed but useless
       // while (true);
        boolean b = true;

       int i = 1;


        if ( b)
            if (i == 1 )
                System.out.println(i);
            else
                System.out.println(2);
            else
            System.out.println(3);





    }

}
