class Taxi extends Vehicle {

    private double ratePerKm;
    private String category;
    private String driverName;
    private double rating;

    // Constructor
    Taxi(String vehicleId,
         double ratePerKm,
         String category,
         String driverName,
         double rating) {

        super(vehicleId);

        this.ratePerKm = ratePerKm;
        this.category = category;
        this.driverName = driverName;
        this.rating = rating;
    }

    // Getter for Fare
    public double getRatePerKm() {
        return ratePerKm;
    }

    // Setter for Fare
    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    // Getter for Category
    public String getCategory() {
        return category;
    }

    // Setter for Category
    public void setCategory(String category) {
        this.category = category;
    }

    // Getter for Driver Name
    public String getDriverName() {
        return driverName;
    }

    // Setter for Driver Name
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    // Getter for Rating
    public double getRating() {
        return rating;
    }

    // Setter for Rating
    public void setRating(double rating) {
        this.rating = rating;
    }

    // Calculate Fare
    @Override
    public double calculateFare(int distance) {
        return distance * ratePerKm;
    }
}
