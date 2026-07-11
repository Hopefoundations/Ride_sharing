// ======================================
// Customer.java
// Customer Class
// ======================================

class Customer {

    // Customer Details
    private final int customerId;
    private String customerName;
    private String mobileNumber;
    private String pickupLocation;
    private String dropLocation;

    // Constructor
    Customer(int customerId,
             String customerName,
             String mobileNumber,
             String pickupLocation,
             String dropLocation) {

        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
    }

    // Getters

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    // Setters

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    // Display Customer Details

    public void displayCustomer() {

        System.out.println("\n========== CUSTOMER DETAILS ==========");

        System.out.println("Customer ID      : " + customerId);
        System.out.println("Customer Name    : " + customerName);
        System.out.println("Mobile Number    : " + mobileNumber);
        System.out.println("Pickup Location  : " + pickupLocation);
        System.out.println("Drop Location    : " + dropLocation);

        System.out.println("======================================");
    }

    @Override
    public String toString() {

        return "Customer ID : " + customerId +
               "\nCustomer Name : " + customerName +
               "\nMobile Number : " + mobileNumber +
               "\nPickup : " + pickupLocation +
               "\nDrop : " + dropLocation;
    }
}
