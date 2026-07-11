import java.util.Scanner;

public class TaxiBookingSystem {

    // ===========================
    // Global Variables
    // ===========================

    static Scanner sc = new Scanner(System.in);

    static Vehicle[] taxis = new Vehicle[3];

    static Booking[] bookings = new Booking[50];

    static int bookingCount = 0;

    static int customerIdCounter = 1001;

    static int bookingIdCounter = 1001;

    static double totalRevenue = 0;

    // ===========================
    // Initialize Taxis
    // ===========================

    public static void initializeTaxis() {

        taxis[0] = new Taxi(
                "TX101",
                "Mini",
                "Rahul",
                4.8,
                15);

        taxis[1] = new Taxi(
                "TX102",
                "Sedan",
                "Arun",
                4.6,
                20);

        taxis[2] = new Taxi1(
                "PTX201",
                "Premium",
                "Karthik",
                4.9,
                30);
    }

    // ===========================
    // Generate Customer ID
    // ===========================

    public static int generateCustomerId() {

        return customerIdCounter++;
    }

    // ===========================
    // Generate Booking ID
    // ===========================

    public static String generateBookingId() {

        return "BK" + bookingIdCounter++;
    }

    // ===========================
    // Display Taxi Status
    // ===========================

    public static void displayTaxis() {

        System.out.println("\n========== TAXI STATUS ==========");

        for (int i = 0; i < taxis.length; i++) {

            System.out.println();

            System.out.println("Taxi Number : " + (i + 1));

            System.out.println("Taxi ID     : "
                    + taxis[i].getVehicleId());

            System.out.println("Category    : "
                    + taxis[i].getCategory());

            System.out.println("Driver      : "
                    + taxis[i].getDriverName());

            System.out.println("Rating      : "
                    + taxis[i].getDriverRating()
                    + " ★");

            System.out.println("Fare / Km   : ₹"
                    + taxis[i].getRatePerKm());

            if (taxis[i].isAvailable()) {

                System.out.println("Status      : Available");

            } else {

                System.out.println("Status      : Already Booked");
            }
        }
    }

    // ===========================
    // Apply Coupon
    // ===========================

    public static int applyCoupon(int fare) {

        System.out.print(
                "\nEnter Coupon Code (SAVE50 / SAVE100 / NONE): ");

        String coupon = sc.next();

        if (coupon.equalsIgnoreCase("SAVE50")) {

            System.out.println("₹50 Discount Applied");

            return fare - 50;
        }

        if (coupon.equalsIgnoreCase("SAVE100")) {

            System.out.println("₹100 Discount Applied");

            return fare - 100;
        }

        System.out.println("No Coupon Applied");

        return fare;
    }

    // ===========================
    // Payment
    // ===========================

    public static String payment(int amount) {

        System.out.println("\n========== PAYMENT ==========");

        System.out.println("Amount : ₹" + amount);

        System.out.println("1. UPI");
        System.out.println("2. Cash");
        System.out.println("3. Card");
        System.out.println("4. Net Banking");

        System.out.print("Choose Payment : ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:

                System.out.println("UPI Payment Successful");

                return "UPI";

            case 2:

                System.out.println("Cash Payment Successful");

                return "Cash";

            case 3:

                System.out.println("Card Payment Successful");

                return "Card";

            case 4:

                System.out.println("Net Banking Successful");

                return "Net Banking";

            default:

                System.out.println("Invalid Payment");

                return "Cancelled";
        }
    }

      

    public static void bookTaxi() {

        try {

            int customerId = generateCustomerId();

            System.out.print("\nEnter Customer Name : ");
            String name = sc.next();

            System.out.print("Enter Mobile Number : ");
            String mobile = sc.next();

            System.out.print("Enter Pickup Location : ");
            String pickup = sc.next();

            System.out.print("Enter Drop Location : ");
            String drop = sc.next();

            Customer customer = new Customer(
                    customerId,
                    name,
                    mobile,
                    pickup,
                    drop);

            displayTaxis();

            System.out.print("\nChoose Taxi Number : ");
            int taxiChoice = sc.nextInt();

            if (taxiChoice < 1 || taxiChoice > taxis.length) {

                System.out.println("Invalid Taxi Number.");
                return;
            }

            Vehicle taxi = taxis[taxiChoice - 1];

            if (!taxi.isAvailable()) {

                System.out.println(
                        "\nThis taxi is already booked.");

                return;
            }

            System.out.print("Enter Distance (km) : ");
            int distance = sc.nextInt();

            int fare = (int) taxi.calculateFare(distance);

            int originalFare = fare;

            fare = applyCoupon(fare);

            if (fare < 0) {
                fare = 0;
            }

            int discount = originalFare - fare;

            String paymentMethod = payment(fare);

            if (paymentMethod.equals("Cancelled")) {

                System.out.println(
                        "Booking Cancelled.");

                return;
            }

            taxi.setAvailable(false);

            Booking booking = new Booking(

                    generateBookingId(),

                    customer,

                    taxi,

                    distance,

                    fare,

                    paymentMethod,

                    discount == 0 ? "NONE"
                            : (discount == 50
                            ? "SAVE50"
                            : "SAVE100"),

                    discount,

                    true);

            bookings[bookingCount++] = booking;

            totalRevenue += fare;

            System.out.println(
                    "\nBooking Successful!");

            Receipt.printReceipt(booking);

            trackTaxi();

            System.out.print(
                    "\nRate Driver (1-5) : ");

            double rating = sc.nextDouble();

            if (rating >= 1 && rating <= 5) {

                taxi.setDriverRating(rating);

                System.out.println(
                        "Rating Updated Successfully.");
            }

        }

        catch (Exception e) {

            System.out.println(
                    "Invalid Input.");

            sc.nextLine();
        }
    }

    // ===========================
    // Track Taxi
    // ===========================

    public static void trackTaxi() {

        System.out.println(
                "\nTracking Taxi...");

        for (int i = 5; i >= 1; i--) {

            System.out.println(
                    "Taxi is "
                            + i
                            + " km away.");
        }

        System.out.println(
                "Taxi has reached the pickup location.");

        System.out.println(
                "Ride Started Successfully.");
    }

    // ===========================
    // View Booking History
    // ===========================

    public static void viewBookingHistory() {

        if (bookingCount == 0) {

            System.out.println(
                    "\nNo Bookings Found.");

            return;
        }

        System.out.println(
                "\n========== BOOKING HISTORY ==========");

        for (int i = 0; i < bookingCount; i++) {

            bookings[i].displayBooking();

            System.out.println();
        }
    }
    // ===========================
    // Cancel Booking
    // ===========================

    public static void cancelBooking() {

        if (bookingCount == 0) {

            System.out.println("\nNo Bookings Available.");

            return;
        }

        System.out.print("\nEnter Booking ID : ");

        String bookingId = sc.next();

        boolean found = false;

        for (int i = 0; i < bookingCount; i++) {

            if (bookings[i].getBookingId().equalsIgnoreCase(bookingId)) {

                if (!bookings[i].isBookingStatus()) {

                    System.out.println("Booking Already Cancelled.");

                    return;
                }

                bookings[i].setBookingStatus(false);

                bookings[i].getTaxi().setAvailable(true);

                totalRevenue -= bookings[i].getFare();

                System.out.println("Booking Cancelled Successfully.");

                found = true;

                break;
            }
        }

        if (!found) {

            System.out.println("Booking ID Not Found.");
        }
    }

    // ===========================
    // View Revenue
    // ===========================

    public static void viewRevenue() {

        System.out.println("\n========== REVENUE ==========");

        System.out.println("Total Revenue : ₹" + totalRevenue);

        System.out.println("Total Bookings : " + bookingCount);
    }

    // ===========================
    // Main Method
    // ===========================

    public static void main(String[] args) {

        initializeTaxis();

        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println("     TAXI BOOKING SYSTEM");
            System.out.println("=================================");

            System.out.println("1. View Taxi Status");
            System.out.println("2. Book Taxi");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View Booking History");
            System.out.println("5. View Total Revenue");
            System.out.println("6. Exit");

            System.out.print("\nEnter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    displayTaxis();
                    break;

                case 2:

                    bookTaxi();
                    break;

                case 3:

                    cancelBooking();
                    break;

                case 4:

                    viewBookingHistory();
                    break;

                case 5:

                    viewRevenue();
                    break;

                case 6:

                    System.out.println("\nThank You!");

                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }

}
    
