abstract class Vehicle {

    protected String vehicleId;
    protected boolean available;

    Vehicle(String vehicleId) {
        this.vehicleId = vehicleId;
        this.available = true;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public abstract double calculateFare(int distance);
}