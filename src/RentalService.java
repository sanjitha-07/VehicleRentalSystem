public class RentalService {

    public void rentVehicle(Vehicle v) {
        if (v.isAvailable) {
            v.isAvailable = false;
            System.out.println("Vehicle rented successfully!");
        } else {
            System.out.println("Vehicle is already rented.");
        }
    }

    public void returnVehicle(Vehicle v) {
        v.isAvailable = true;
        System.out.println("Vehicle returned successfully!");
    }
}