// ======================================
// Receipt.java
// Prints Booking Receipt
// ======================================

class Receipt {

    public static void printReceipt(Booking booking) {

        Customer customer = booking.getCustomer();
        Vehicle taxi = booking.getTaxi();

        System.out.println();
        System.out.println("==============================================");
        System.out.println("          TAXI BOOKING RECEIPT");
        System.out.println("==============================================");

        System.out.println("Booking ID      : " + booking.getBookingId());

        System.out.println("----------------------------------------------");

        System.out.println("Customer ID     : " + customer.getCustomerId());
        System.out.println("Customer Name   : " + customer.getCustomerName());
        System.out.println("Mobile Number   : " + customer.getMobileNumber());

        System.out.println("----------------------------------------------");

        System.out.println("Taxi ID         : " + taxi.getVehicleId());
        System.out.println("Category        : " + taxi.getCategory());
        System.out.println("Driver          : " + taxi.getDriverName());
        System.out.println("Driver Rating   : " + taxi.getDriverRating() + " ★");

        System.out.println("----------------------------------------------");

        System.out.println("Pickup          : " + customer.getPickupLocation());
        System.out.println("Drop            : " + customer.getDropLocation());

        System.out.println("Distance        : "
                + booking.getDistance() + " km");

        System.out.println("----------------------------------------------");

        System.out.println("Coupon Applied  : "
                + booking.getCouponCode());

        System.out.println("Discount        : ₹"
                + booking.getDiscountAmount());

        System.out.println("Final Fare      : ₹"
                + booking.getFare());

        System.out.println("Payment Method  : "
                + booking.getPaymentMethod());

        System.out.println("----------------------------------------------");

        if (booking.isBookingStatus()) {

            System.out.println("Booking Status  : CONFIRMED");

        } else {

            System.out.println("Booking Status  : CANCELLED");
        }

        System.out.println("==============================================");
        System.out.println("      Thank You For Riding With Us!");
        System.out.println("==============================================");
    }
}
