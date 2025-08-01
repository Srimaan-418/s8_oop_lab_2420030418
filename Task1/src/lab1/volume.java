package lab1;
import java.util.Scanner;
public class volume {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the radius of the sphere (as a decimal number): ");

	        double radius = scanner.nextDouble();

	        // Calculate the volume using the formula V = (4/3) * PI * r^3
	        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

	        
	        System.out.println("The volume of the sphere is: " + String.format("%.2f", volume) + " cubic units.");

	        scanner.close();
	    }
}

