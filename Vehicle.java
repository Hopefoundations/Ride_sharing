// ======================================
// Vehicle.java
// Abstract Base Class
// ======================================

abstract class Vehicle {

    // Vehicle Information
    protected String vehicleId;
    protected boolean available;
    protected String category;
    protected String driverName;
    protected double driverRating;
    protected double ratePerKm;

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

    // Getters

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

    // Setters

    public void setDriverRating(double driverRating) {
        this.driverRating = driverRating;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Abstract Method

    public abstract double calculateFare(int distance);
}
