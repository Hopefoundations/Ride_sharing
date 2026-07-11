// ======================================
// Taxi1.java
// Premium Taxi
// ======================================

class Taxi1 extends Taxi {

    // Premium Service Charge
    private static final int PREMIUM_CHARGE = 100;

    // Constructor
    Taxi1(String vehicleId,
          String category,
          String driverName,
          double driverRating,
          double ratePerKm) {

        super(vehicleId,
              category,
              driverName,
              driverRating,
              ratePerKm);
    }

    // Runtime Polymorphism
    @Override
    public double calculateFare(int distance) {

        return (distance * ratePerKm) + PREMIUM_CHARGE;
    }

    // Display Premium Information
    @Override
    public void displayTaxiDetails() {

        super.displayTaxiDetails();

        System.out.println("Premium Charge : ₹"
                + PREMIUM_CHARGE);

        System.out.println("Taxi Type      : Premium");
    }
}
