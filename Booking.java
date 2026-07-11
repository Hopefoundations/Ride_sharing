// ======================================
// Booking.java
// Stores Complete Booking Details
// ======================================

class Booking {

    private String bookingId;
    private Customer customer;
    private Vehicle taxi;

    private int distance;
    private int fare;

    private String paymentMethod;
    private String couponCode;

    private int discountAmount;

    private boolean bookingStatus;

    Booking(String bookingId,
            Customer customer,
            Vehicle taxi,
            int distance,
            int fare,
            String paymentMethod,
            String couponCode,
            int discountAmount,
            boolean bookingStatus) {

        this.bookingId = bookingId;
        this.customer = customer;
        this.taxi = taxi;
        this.distance = distance;
        this.fare = fare;
        this.paymentMethod = paymentMethod;
        this.couponCode = couponCode;
        this.discountAmount = discountAmount;
        this.bookingStatus = bookingStatus;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getTaxi() {
        return taxi;
    }

    public int getDistance() {
        return distance;
    }

    public int getFare() {
        return fare;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public boolean isBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public void displayBooking() {

        System.out.println("\n======================================");
        System.out.println("          BOOKING DETAILS");
        System.out.println("======================================");

        System.out.println("Booking ID      : " + bookingId);
        System.out.println("Customer ID     : " + customer.getCustomerId());
        System.out.println("Customer Name   : " + customer.getCustomerName());
        System.out.println("Mobile Number   : " + customer.getMobileNumber());

        System.out.println();

        System.out.println("Taxi ID         : " + taxi.getVehicleId());
        System.out.println("Category        : " + taxi.getCategory());
        System.out.println("Driver          : " + taxi.getDriverName());
        System.out.println("Driver Rating   : " + taxi.getDriverRating());

        System.out.println();

        System.out.println("Pickup          : " + customer.getPickupLocation());
        System.out.println("Drop            : " + customer.getDropLocation());

        System.out.println("Distance        : " + distance + " km");

        System.out.println();

        System.out.println("Coupon          : " + couponCode);
        System.out.println("Discount        : ₹" + discountAmount);
        System.out.println("Final Fare      : ₹" + fare);

        System.out.println();

        System.out.println("Payment Method  : " + paymentMethod);

        System.out.println("Booking Status  : "
                + (bookingStatus ? "Confirmed" : "Cancelled"));

        System.out.println("======================================");
    }
}
