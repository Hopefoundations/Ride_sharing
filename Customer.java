// ======================================
// Customer.java
// Customer Class
// ======================================

class Customer {

    // Customer Details
    private int customerId;
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

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    // Display Customer Details

    public void displayCustomer() {

        System.out.println("--------------------------------");
        System.out.println("Customer ID    : " + customerId);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Pickup         : " + pickupLocation);
        System.out.println("Drop           : " + dropLocation);
        System.out.println("--------------------------------");
    }
}
