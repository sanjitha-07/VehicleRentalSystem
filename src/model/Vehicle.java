package model;
public class Vehicle {
    protected int id;
    protected String brand;
    protected double pricePerDay;
    protected boolean isAvailable;

    public Vehicle(int id, String brand, double pricePerDay) {
        this.id = id;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Price per day: " + pricePerDay);
        System.out.println("Available: " + isAvailable);
    }
    public double getPricePerDay() {
    return pricePerDay;
}

public boolean isAvailable() {
    return isAvailable;
}

public void setAvailable(boolean available) {
    this.isAvailable = available;
}
public String getBrand() {
    return brand;
}
}