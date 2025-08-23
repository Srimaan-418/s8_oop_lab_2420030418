package Lab5;
import java.util.Scanner;

class Order {
    private int orderId;
    private String customerName;

    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public void printDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
    }
}

class OnlineOrder extends Order {
    private String shippingAddress;

    public OnlineOrder(int orderId, String customerName, String shippingAddress) {
        super(orderId, customerName);
        this.shippingAddress = shippingAddress;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Shipping Address: " + shippingAddress);
    }
}

public class ecom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Order Details:");
        System.out.print("Order ID: ");
        int orderId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Shipping Address: ");
        String shippingAddress = scanner.nextLine();

        OnlineOrder myOrder = new OnlineOrder(orderId, customerName, shippingAddress);

        myOrder.printDetails();
        
        scanner.close();
    }
}
