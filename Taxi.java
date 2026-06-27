class Taxi extends Vehicle {

    private double ratePerKm;

    Taxi(String vehicleId, double ratePerKm) {
        super(vehicleId);
        this.ratePerKm = ratePerKm;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    @Override
    public double calculateFare(int distance) {
        return distance * ratePerKm;
    }
}