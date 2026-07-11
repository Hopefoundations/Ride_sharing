// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class Taxi extends Vehicle {
   private double ratePerKm = (double)15.0F;

   Taxi(String vehicleId) {
      super(vehicleId);
   }

   public double getRatePerKm() {
      return this.ratePerKm;
   }

   public void setRatePerKm(double ratePerKm) {
      this.ratePerKm = ratePerKm;
   }

   public double calculateFare(int distance) {
      return (double)distance * this.ratePerKm;
   }
}
