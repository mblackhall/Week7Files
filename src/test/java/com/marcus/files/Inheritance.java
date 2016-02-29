package com.marcus.files;



/**
 * @author marcus
 */
class Animal {
    public void eat(){
        System.out.println("Animal eating");

    }

}

class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("dog eating");

    }
    public void eat(String s){
        System.out.println("dog eating");

    }
    public int eat(int s){
        return 6;

    }
}
public class Inheritance {


    public static void main(String[] args) {

        Animal a = new Dog();
        new Inheritance().whosEating(a);
    }

    public  void whosEating(Animal a){
        a.eat();
    }

}
