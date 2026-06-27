class Customer {

    private final String customerName;
    private final String pickup;
    private final String drop;

    Customer(String customerName, String pickup, String drop) {
        this.customerName = customerName;
        this.pickup = pickup;
        this.drop = drop;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDrop() {
        return drop;
    }
}