class Receipt {

    public static void printReceipt(Booking booking) {

        Taxi taxi = booking.getTaxi();
        Customer customer = booking.getCustomer();

        System.out.println();
        System.out.println("======================================");
        System.out.println("            TAXI RECEIPT");
        System.out.println("======================================");

        System.out.println("Booking ID      : " + booking.getBookingId());
        System.out.println("Customer ID     : " + customer.getCustomerId());
        System.out.println("Customer Name   : " + customer.getCustomerName());
        System.out.println("Mobile Number   : " + customer.getMobileNumber());

        System.out.println("--------------------------------------");

        System.out.println("Taxi ID         : " + taxi.getVehicleId());
        System.out.println("Category        : " + taxi.getCategory());
        System.out.println("Driver          : " + taxi.getDriverName());
        System.out.println("Driver Rating   : " + taxi.getRating() + " ★");

        System.out.println("--------------------------------------");

        System.out.println("Pickup          : " + customer.getPickup());
        System.out.println("Drop            : " + customer.getDrop());
        System.out.println("Distance        : " + booking.getDistance() + " km");

        System.out.println("--------------------------------------");

        System.out.println("Fare            : Rs." + booking.getFare());
        System.out.println("Payment Mode    : " + booking.getPaymentMode());

        if (booking.isPaymentStatus()) {
            System.out.println("Payment Status  : PAID");
        } else {
            System.out.println("Payment Status  : PENDING");
        }

        if (booking.isBookingStatus()) {
            System.out.println("Booking Status  : CONFIRMED");
        } else {
            System.out.println("Booking Status  : CANCELLED");
        }

        System.out.println("======================================");
        System.out.println("   Thank You for Choosing Our Taxi!");
        System.out.println("======================================");
    }
}
