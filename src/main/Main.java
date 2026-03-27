package main;
import java.util.Scanner;
import java.util.ArrayList;

import model.*;
import service.FileHandler;
import service.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FileHandler fileHandler = new FileHandler();

      ArrayList<Car> cars = new ArrayList<>();

cars.add(new Car(1, "Toyota", 2000, 5));
cars.add(new Car(2, "Hyundai", 1800, 5));
cars.add(new Car(3, "Honda", 2200, 5));

    
      ArrayList<Bike> bikes = new ArrayList<>();

bikes.add(new Bike(4, "Yamaha", 800, true));
bikes.add(new Bike(5, "KTM", 1200, true));
bikes.add(new Bike(6, "Bajaj", 700, true));
ArrayList<Scooter> scooters = new ArrayList<>();

scooters.add(new Scooter(7, "Activa", 500));
scooters.add(new Scooter(8, "Jupiter", 550));
scooters.add(new Scooter(9, "Access", 600));
        System.out.println(" Vehicle Rental System ");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Scooter");

        System.out.print("Choose vehicle type: ");
        int type;

try {
    type = sc.nextInt();
} catch (Exception e) {
    System.out.println("Invalid input! Please enter a number.");
    return;
}
if (type == 1) {
System.out.println("\nAvailable Cars:");

for (int i = 0; i < cars.size(); i++) {
    Car c = cars.get(i);
    System.out.println((i + 1) + ". " + c.getBrand() + " - Rs" + c.getPricePerDay());
}

System.out.print("Select car: ");
int choice;

try {
    choice = sc.nextInt();
} catch (Exception e) {
    System.out.println("Invalid input!");
    return;
}

if (choice < 1 || choice > cars.size()) {
    System.out.println("Invalid selection!");
    return;
}

Car selectedCar = cars.get(choice - 1);

System.out.print("Enter number of days: ");
int days;

try {
    days = sc.nextInt();
} catch (Exception e) {
    System.out.println("Invalid number of days!");
    return;
}

double total = days * selectedCar.getPricePerDay();

System.out.println("Total Cost: ₹" + total);
String data = selectedCar.getBrand() + ", " + days + " days, Rs" + total;

fileHandler.saveBooking(data);
}
else if(type == 2)
{
       System.out.println("\nAvailable Bikes:");

for (int i = 0; i < bikes.size(); i++) {
    Bike b = bikes.get(i);
    System.out.println((i + 1) + ". " + b.getBrand() + " - Rs" + b.getPricePerDay());
}

System.out.print("Select bike: ");
int choice;

try {
    choice = sc.nextInt();
} catch (Exception e) {
    System.out.println("Invalid input!");
    return;
}

if (choice < 1 || choice > bikes.size()) {
    System.out.println("Invalid selection!");
    return;
}

Bike selectedBike = bikes.get(choice - 1);

System.out.print("Enter number of days: ");
int days;

try {
    days = sc.nextInt();
} catch (Exception e) {
    System.out.println("Invalid number of days!");
    return;
}

double total = days * selectedBike.getPricePerDay();

System.out.println("Total Cost: ₹" + total);
String data = selectedBike.getBrand() + ", " + days + " days, Rs" + total;

fileHandler.saveBooking(data);
        }
        else if(type == 3){
System.out.println("\nAvailable Scooters:");

for (int i = 0; i < scooters.size(); i++) {
    Scooter s = scooters.get(i);
    System.out.println((i + 1) + ". " + s.getBrand() + " - Rs" + s.getPricePerDay());
}

System.out.print("Select scooter: ");
int choice;

try {
    choice = sc.nextInt();
} catch (Exception e) {
    System.out.println("Invalid input!");
    return;
}

if (choice < 1 || choice > scooters.size()) {
    System.out.println("Invalid selection!");
    return;
}

Scooter selectedScooter = scooters.get(choice - 1);

System.out.print("Enter number of days: ");
int days;

try {
    days = sc.nextInt();
} catch (Exception e) {
    System.out.println("Invalid number of days!");
    return;
}

double total = days * selectedScooter.getPricePerDay();

System.out.println("Total Cost: ₹" + total);
String data = selectedScooter.getBrand() + ", " + days + " days, Rs" + total;

fileHandler.saveBooking(data);
        }
     
        else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}