
class Taxi extends Vehicle {

    // Constructor
    Taxi(String vehicleId,
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

    // Fare Calculation
    @Override
    public double calculateFare(int distance) {

        return distance * ratePerKm;
    }

    // Display Taxi Details
    public void displayTaxiDetails() {

        System.out.println("------------------------------");
        System.out.println("Taxi ID      : " + vehicleId);
        System.out.println("Category     : " + category);
        System.out.println("Driver       : " + driverName);
        System.out.println("Rating       : " + driverRating + " ★");
        System.out.println("Fare / Km    : ₹" + ratePerKm);
        System.out.println("Status       : "
                + (available ? "Available" : "Booked"));
        System.out.println("------------------------------");
    }
}
