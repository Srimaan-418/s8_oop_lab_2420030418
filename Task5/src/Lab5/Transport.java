package Lab5;

public class Transport {

    public void ticketPrice() {
        System.out.println("The base ticket price is not specified.");
    }

    public static void main(String[] args) {
        Transport myTransport = new Transport();
        Transport myBus = new Bus();
        Transport myTrain = new Train();

        System.out.println("Demonstrating Method Overriding in Java:");
        System.out.println("---------------------------------------");

        myTransport.ticketPrice();
        myBus.ticketPrice();
        myTrain.ticketPrice();
    }
}

class Bus extends Transport {
    @Override
    public void ticketPrice() {
        System.out.println("The ticket price for the Bus is $25.");
    }
}

class Train extends Transport {
    @Override
    public void ticketPrice() {
        System.out.println("The ticket price for the Train is $60.");
    }
}

