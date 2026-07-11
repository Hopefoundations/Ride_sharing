class Taxi1 extends Taxi {

    // Constructor
    Taxi1(String vehicleId,
          double ratePerKm,
          String category,
          String driverName,
          double rating) {

        super(vehicleId,
              ratePerKm,
              category,
              driverName,
              rating);
    }

    // Polymorphism
    @Override
    public double calculateFare(int distance) {

        // Premium Taxi Fare
        return distance * getRatePerKm();
    }
}
