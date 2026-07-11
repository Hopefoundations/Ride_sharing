class Customer {

    // Encapsulation
    private int customerId;
    private String customerName;
    private String mobileNumber;
    private String pickup;
    private String drop;

    // Constructor
    Customer(int customerId,
             String customerName,
             String mobileNumber,
             String pickup,
             String drop) {

        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
        this.pickup = pickup;
        this.drop = drop;
    }

    // Getter Methods

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDrop() {
        return drop;
    }

    // Setter Methods

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public void setDrop(String drop) {
        this.drop = drop;
    }
}
