package lab3;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EventCountdown {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.print("Enter event date and time (yyyy-MM-dd HH:mm): ");
        String userInput = scanner.nextLine();

        try {
            LocalDateTime eventDateTime = LocalDateTime.parse(userInput, formatter);

            LocalDateTime now = LocalDateTime.now();

            if (eventDateTime.isBefore(now)) {
                System.out.println("The event has already passed.");
            } else {
                Duration duration = Duration.between(now, eventDateTime);

                long totalMinutes = duration.toMinutes();
                long days = totalMinutes / (24 * 60);
                long hours = (totalMinutes % (24 * 60)) / 60;
                long minutes = totalMinutes % 60;

                System.out.println("Time remaining until event:");
                System.out.println("\t" + days + " days, " + hours + " hours, and " + minutes + " minutes");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date and time format. Please use yyyy-MM-dd HH:mm.");
        } finally {
            scanner.close();
        }
    }
}
