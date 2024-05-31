package org.example;


public class Main {
    public static void main(String[] args) {

        Car car = new Car("VW", "Golf", 2019, 4);
        car.displayInfo();

        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "ABC", 2023, "Chopper");
        motorcycle.displayInfo();
    }
}
