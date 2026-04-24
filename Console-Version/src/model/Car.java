package model;
public class Car extends Vehicle {
    private int seatingCapacity;

    public Car(int id, String brand, double pricePerDay, int seatingCapacity) {
        super(id, brand, pricePerDay);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("----------------------");
    }
}