package service;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandler {
    public void saveBooking(String data) {
        try {
            FileWriter writer = new FileWriter("bookings.txt", true);
            writer.write(data + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving booking!");
        }
    }
}