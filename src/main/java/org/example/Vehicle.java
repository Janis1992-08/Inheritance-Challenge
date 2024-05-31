package org.example;

import java.util.Objects;

public class Vehicle {

    private String Manufacturer;
    private String Model;
    private int YearOfManufacture;


    public Vehicle(String Manufacturer, String Model, int YearOfManufacture) {
        this.Manufacturer = Manufacturer;
        this.Model = Model;
        this.YearOfManufacture = YearOfManufacture;
    }

    public void displayInfo(){
        System.out.println(Manufacturer+" "+Model+" "+YearOfManufacture);
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYearOfManufacture() {
        return YearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        YearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Manufacturer='" + Manufacturer + '\'' +
                ", Model='" + Model + '\'' +
                ", YearOfManufacture='" + YearOfManufacture + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(Manufacturer, vehicle.Manufacturer) && Objects.equals(Model, vehicle.Model) && Objects.equals(YearOfManufacture, vehicle.YearOfManufacture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Manufacturer, Model, YearOfManufacture);
    }
}
