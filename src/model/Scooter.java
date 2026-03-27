package model;
public class Scooter extends Vehicle {

    public Scooter(int id, String brand, double pricePerDay) {
        super(id, brand, pricePerDay);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Scooter");
        System.out.println("----------------------");
    }
}