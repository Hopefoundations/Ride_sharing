class Taxi1 extends Taxi {

    Taxi1(String vehicleId, double ratePerKm) {
        super(vehicleId, ratePerKm);
    }

    @Override
    public double calculateFare(int distance) {
        return distance * getRatePerKm();
    }
}