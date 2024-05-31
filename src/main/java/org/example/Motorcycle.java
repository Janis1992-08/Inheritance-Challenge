package org.example;

public class Motorcycle extends Vehicle {

    private final String Type;

    public Motorcycle(String Manufacturer, String Model, int YearOfManufacture, String Type) {
        super(Manufacturer, Model, YearOfManufacture);
        this.Type = Type;

    }

    @Override
    public void displayInfo(){
        System.out.println("Type of Motorcycle: " + Type);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "Type='" + Type + '\'' +
                '}';
    }
}
