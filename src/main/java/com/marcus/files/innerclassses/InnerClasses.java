package com.marcus.files.innerclassses;

/**
 * @author marcus
 */
public class InnerClasses {

    private int x;

    private Inner makeInner(){
        return new Inner();
    }

    public class Inner {


        void viewOuter(){

            System.out.println(" i can see x" + x + " and " + InnerClasses.this.x);

        }


    }

    public static void main(String[] args) {

        InnerClasses.Inner outerinner = new InnerClasses().new Inner();


    }

}
