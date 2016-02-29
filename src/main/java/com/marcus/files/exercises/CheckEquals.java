package com.marcus.files.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marcus
 */

class Person {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Person(String name) {
        this.name = name;
    }

    // to check if too objects are equal override the equals and hashcode methods
    // if equals then the hashcodes have to be the same.
    // it is not true that if two hashcodes are the same then the objects are equal !

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o instanceof Person) {

            if (((Person) o).getName().equals(this.getName())) {
                return true;
            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}

public class CheckEquals {


    public static void main(String[] args) {

        Person p1 = new Person("bob");
        Person p2 = new Person("bob");
        System.out.println(p1.equals(p2));


        List list = new ArrayList<>();
        list.add(p1);

        System.out.println(list.contains(new Person("bob")));


    }


}
