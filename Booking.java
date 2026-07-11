class Booking {

    // Booking Details
    private String bookingId;
    private Customer customer;
    private Taxi taxi;

    private int distance;
    private int fare;

    private String paymentMode;
    private boolean paymentStatus;
    private boolean bookingStatus;

    // Constructor
    Booking(String bookingId,
            Customer customer,
            Taxi taxi,
            int distance,
            int fare,
            String paymentMode,
            boolean paymentStatus,
            boolean bookingStatus) {

        this.bookingId = bookingId;
        this.customer = customer;
        this.taxi = taxi;
        this.distance = distance;
        this.fare = fare;
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
        this.bookingStatus = bookingStatus;
    }

    // Getter Methods

    public String getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public int getDistance() {
        return distance;
    }

    public int getFare() {
        return fare;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public boolean isBookingStatus() {
        return bookingStatus;
    }

    // Setter Methods

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    // Display Booking Details

    public void displayBooking() {

        System.out.println("\n==============================");
        System.out.println("        BOOKING DETAILS");
        System.out.println("==============================");

        System.out.println("Booking ID      : " + bookingId);
        System.out.println("Customer ID     : "
                + customer.getCustomerId());

        System.out.println("Customer Name   : "
                + customer.getCustomerName());

        System.out.println("Mobile Number   : "
                + customer.getMobileNumber());

        System.out.println("Pickup          : "
                + customer.getPickup());

        System.out.println("Drop            : "
                + customer.getDrop());

        System.out.println("Taxi ID         : "
                + taxi.getVehicleId());

        System.out.println("Driver          : "
                + taxi.getDriverName());

        System.out.println("Category        : "
                + taxi.getCategory());

        System.out.println("Distance        : "
                + distance + " km");

        System.out.println("Fare            : Rs."
                + fare);

        System.out.println("Payment Mode    : "
                + paymentMode);

        System.out.println("Payment Status  : "
                + (paymentStatus ? "Paid" : "Pending"));

        System.out.println("Booking Status  : "
                + (bookingStatus ? "Confirmed" : "Cancelled"));

        System.out.println("==============================");
    }
}
