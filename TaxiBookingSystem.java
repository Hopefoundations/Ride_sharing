import java.util.Scanner;

public class TaxiBookingSystem {

    private static final Taxi[] taxis = new Taxi[3];

    // Display Taxi Status
    public static void displayTaxis() {

        System.out.println("\n===== TAXI STATUS =====");

        for (int i = 0; i < taxis.length; i++) {

            System.out.print((i + 1) + ". "
                    + taxis[i].getVehicleId()
                    + " - Rs."
                    + taxis[i].getRatePerKm()
                    + "/km");

            if (taxis[i].isAvailable()) {
                System.out.println(" [Available]");
            } else {
                System.out.println(" [Already Booked]");
            }
        }
    }

    // Payment Method
    public static boolean makePayment(Scanner sc, int amount) {

        System.out.println("\n===== PAYMENT =====");
        System.out.println("Total Amount : Rs." + amount);

        System.out.println("1. UPI");
        System.out.println("2. Cash");
        System.out.println("3. Cancel Payment");

        System.out.print("Enter Choice : ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("UPI Payment Successful");
                return true;

            case 2:
                System.out.println("Cash Payment Successful");
                return true;

            case 3:
                System.out.println("Payment Cancelled");
                return false;

            default:
                System.out.println("Invalid Payment Option");
                return false;
        }
    }

    // Book Taxi
    public static void bookTaxi(Scanner sc) {

        try {

            System.out.print("Enter Customer Name : ");
            String name = sc.next();

            System.out.print("Enter Pickup Location : ");
            String pickup = sc.next();

            System.out.print("Enter Drop Location : ");
            String drop = sc.next();

            Customer customer =
                    new Customer(name, pickup, drop);

            displayTaxis();

            System.out.print("Choose Taxi Number : ");
            int choice = sc.nextInt();

            if (choice < 1 || choice > taxis.length) {
                System.out.println("Invalid Taxi Choice");
                return;
            }

            Vehicle taxi = taxis[choice - 1];

            if (!taxi.isAvailable()) {

                System.out.println("\nSorry!");
                System.out.println("Taxi "
                        + taxi.getVehicleId()
                        + " is already booked.");
                return;
            }

            System.out.print("Enter Distance (km) : ");
            int distance = sc.nextInt();

            double fare =
                    taxi.calculateFare(distance);

            int finalFare = (int) fare;

            boolean paymentStatus =
                    makePayment(sc, finalFare);

            if (!paymentStatus) {
                System.out.println("Booking Failed");
                return;
            }

            taxi.setAvailable(false);

            System.out.println("\n===== BOOKING SUCCESSFUL =====");
            System.out.println("Customer : "
                    + customer.getCustomerName());
            System.out.println("Pickup   : "
                    + customer.getPickup());
            System.out.println("Drop     : "
                    + customer.getDrop());
            System.out.println("Taxi ID  : "
                    + taxi.getVehicleId());
            System.out.println("Fare     : Rs."
                    + finalFare);

            trackTaxi();

        } catch (Exception e) {

            System.out.println("Invalid Input");
            sc.nextLine();
        }
    }

    // Cancel Booking
    public static void cancelBooking(Scanner sc) {

        displayTaxis();

        System.out.print(
                "Enter Taxi Number to Cancel : ");

        int choice = sc.nextInt();

        if (choice < 1 || choice > taxis.length) {
            System.out.println("Invalid Taxi Number");
            return;
        }

        Vehicle taxi = taxis[choice - 1];

        if (taxi.isAvailable()) {
            System.out.println("No Booking Found");
        } else {
            taxi.setAvailable(true);
            System.out.println(
                    "Booking Cancelled Successfully");
        }
    }

    // Track Taxi
    public static void trackTaxi() {

        System.out.println("\nTracking Taxi...");

        for (int i = 5; i >= 1; i--) {

            System.out.println("Taxi is "
                    + i
                    + " km away from pickup location");
        }

        System.out.println(
                "Taxi has reached your pickup location.");
    }

    // Main Method
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            taxis[0] = new Taxi("TX101", 12.0);
            taxis[1] = new Taxi("TX102", 18.0);
            taxis[2] = new Taxi1("PTX103", 25.0);

            int choice;

            do {

                System.out.println(
                        "\n===== TAXI BOOKING SYSTEM =====");

                System.out.println(
                        "1. View Taxi Status");
                System.out.println(
                        "2. Book Taxi");
                System.out.println(
                        "3. Cancel Booking");
                System.out.println(
                        "4. Exit");

                System.out.print("Enter Choice : ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        displayTaxis();
                        break;

                    case 2:
                        bookTaxi(sc);
                        break;

                    case 3:
                        cancelBooking(sc);
                        break;

                    case 4:
                        System.out.println("Thank You!");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

            } while (choice != 4);
        }
    }
}