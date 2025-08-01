package lab1;
import java.util.Scanner;
public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the morning shift earnings (in rupees): ");
	        double morningShiftEarnings = scanner.nextDouble();

	        System.out.print("Enter the evening shift earnings (in rupees): ");
	        double eveningShiftEarnings = scanner.nextDouble();

	        double totalDailyEarnings = morningShiftEarnings + eveningShiftEarnings;

	     
	        System.out.println("Total daily earnings: " + totalDailyEarnings + " rupees.");
	        

	        scanner.close();
	}

}
