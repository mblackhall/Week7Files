package com.marcus.files.innerclassses;

/**
 * @author marcus
 */
public class UsingPersonBuilder {

    public static void main(String[] args) {

        Person person = new Person.PersonBuilder("marcus", "amsterdam", "1111XX").lastName("blackhall").createPerson();
    }
}
