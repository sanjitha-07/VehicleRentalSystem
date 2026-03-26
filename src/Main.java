import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cars
        Car car1 = new Car(1, "Toyota", 2000, 5);
        Car car2 = new Car(2, "Hyundai", 1800, 5);
        Car car3 = new Car(3, "Honda", 2200, 5);

        // Bikes
        Bike bike1 = new Bike(4, "Yamaha", 800, true);
        Bike bike2 = new Bike(5, "KTM", 1200, true);
        Bike bike3 = new Bike(6, "Bajaj", 700, true);

        // Scooters
        Scooter scooter1 = new Scooter(7, "Activa", 500);
        Scooter scooter2 = new Scooter(8, "Jupiter", 550);
        Scooter scooter3 = new Scooter(9, "Access", 600);

        System.out.println("===== Vehicle Rental System =====");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Scooter");

        System.out.print("Choose vehicle type: ");
        int type = sc.nextInt();

        if (type == 1) {
            System.out.println("\nAvailable Cars:");
            System.out.println("1. Toyota - ₹2000/day");
            System.out.println("2. Hyundai - ₹1800/day");
            System.out.println("3. Honda - ₹2200/day");

            System.out.print("Select car: ");
            int choice = sc.nextInt();

            System.out.print("Enter number of days: ");
            int days = sc.nextInt();

            double price = 0;

            if (choice == 1) price = car1.pricePerDay;
            else if (choice == 2) price = car2.pricePerDay;
            else if (choice == 3) price = car3.pricePerDay;

            System.out.println("Total Cost: ₹" + (price * days));
        }

        else if (type == 2) {
            System.out.println("\nAvailable Bikes:");
            System.out.println("1. Yamaha - ₹800/day");
            System.out.println("2. KTM - ₹1200/day");
            System.out.println("3. Bajaj - ₹700/day");

            System.out.print("Select bike: ");
            int choice = sc.nextInt();

            System.out.print("Enter number of days: ");
            int days = sc.nextInt();

            double price = 0;

            if (choice == 1) price = bike1.pricePerDay;
            else if (choice == 2) price = bike2.pricePerDay;
            else if (choice == 3) price = bike3.pricePerDay;

            System.out.println("Total Cost: ₹" + (price * days));
        }

        else if (type == 3) {
            System.out.println("\nAvailable Scooters:");
            System.out.println("1. Activa - ₹500/day");
            System.out.println("2. Jupiter - ₹550/day");
            System.out.println("3. Access - ₹600/day");

            System.out.print("Select scooter: ");
            int choice = sc.nextInt();

            System.out.print("Enter number of days: ");
            int days = sc.nextInt();

            double price = 0;

            if (choice == 1) price = scooter1.pricePerDay;
            else if (choice == 2) price = scooter2.pricePerDay;
            else if (choice == 3) price = scooter3.pricePerDay;

            System.out.println("Total Cost: ₹" + (price * days));
        }

        else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}