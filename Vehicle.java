// ======================================
// Vehicle.java
// Abstract Base Class
// ======================================

abstract class Vehicle {

    // Common Vehicle Details
    protected String vehicleId;
    protected String category;
    protected String driverName;
    protected double driverRating;
    protected double ratePerKm;
    protected boolean available;

    // Constructor
    Vehicle(String vehicleId,
            String category,
            String driverName,
            double driverRating,
            double ratePerKm) {

        this.vehicleId = vehicleId;
        this.category = category;
        this.driverName = driverName;
        this.driverRating = driverRating;
        this.ratePerKm = ratePerKm;
        this.available = true;
    }

    // ----------------------------
    // Getter Methods
    // ----------------------------

    public String getVehicleId() {
        return vehicleId;
    }

    public String getCategory() {
        return category;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getDriverRating() {
        return driverRating;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public boolean isAvailable() {
        return available;
    }

    // ----------------------------
    // Setter Methods
    // ----------------------------

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setDriverRating(double driverRating) {
        this.driverRating = driverRating;
    }

    // ----------------------------
    // Display Vehicle Details
    // ----------------------------

    public void displayVehicle() {

        System.out.println("--------------------------------");
        System.out.println("Vehicle ID   : " + vehicleId);
        System.out.println("Category     : " + category);
        System.out.println("Driver       : " + driverName);
        System.out.println("Rating       : " + driverRating + " ★");
        System.out.println("Fare / Km    : ₹" + ratePerKm);
        System.out.println("Status       : "
                + (available ? "Available" : "Booked"));
        System.out.println("--------------------------------");
    }

    // ----------------------------
    // String Representation
    // ----------------------------

    @Override
    public String toString() {

        return vehicleId + " | "
                + category + " | "
                + driverName + " | ₹"
                + ratePerKm + "/km";
    }

    // ----------------------------
    // Abstract Method
    // ----------------------------

    public abstract double calculateFare(int distance);
}
