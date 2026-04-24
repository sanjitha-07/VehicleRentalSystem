package model;
public class Bike extends Vehicle {
    private boolean hasGear;

    public Bike(int id, String brand, double pricePerDay, boolean hasGear) {
        super(id, brand, pricePerDay);
        this.hasGear = hasGear;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Gear: " + hasGear);
        System.out.println("----------------------");
    }
}