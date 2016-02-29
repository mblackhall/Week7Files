package com.marcus.files.innerclassses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author marcus
 */
class Car {

    private String make;
    private Double price;

    Car(String make,Double price){
        this.make = make;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
public class Anonymous {

    List<Car> cars = new ArrayList<>();

    Anonymous(){
        Car  c1 = new Car("Ferrari",50000d);
        Car  c2 = new Car("Subaru",25000d);
        Car  c3 = new Car("Fiat Panda",10000d);
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);


    }

    public static void main(String[] args) {

        Anonymous anonymous = new Anonymous();
        anonymous.sortCarsByMake();

        anonymous.printCars();
        anonymous.sortByCost();
        anonymous.printCars();

    }

    private void printCars() {
        System.out.printf("%-15s %-15s%n","Make","Cost");
        for(Car car: cars){
            System.out.printf("%-15s %-8.2f%n",car.getMake(),car.getPrice());

        }
    }

    private void sortCarsByMake() {

        // sorts by make

        Collections.sort(cars,new Comparator<Car>(){
            @Override
            public int compare(Car o1, Car o2) {
                return o2.getMake().compareTo(o1.getMake());
            }
        });

    }

    private void sortByCost (){

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
               if (o1.getPrice().doubleValue() < o2.getPrice()) return 1;
               else {
                   if ( o1.getPrice().doubleValue() < o2.getPrice()) {
                       return 1;
                   }
               }
               return -1;

            }
        });
    }

}
