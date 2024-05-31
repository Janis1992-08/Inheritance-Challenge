package org.example;


public class Car extends Vehicle {

    private final int NumberOfDoors;



    public Car(String Manufacturer, String Model, int YearOfManufacture, int numberOfDoors) {
        super(Manufacturer, Model, YearOfManufacture);
        this.NumberOfDoors = numberOfDoors;

    }

    @Override
    public void displayInfo(){
        System.out.println("Number of Doors: " + NumberOfDoors);
    };



    @Override
    public String toString() {
        return "Car{" +
                "NumberOfDoors=" + NumberOfDoors +
                '}';
    }


}
