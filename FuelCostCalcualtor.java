class FuelCostCalculator{
  public static void main(String[] args){
    double distance=350.5;
    float mileage=18.5f;
    double fuelPrice=105.75;
    double fuelNeeded=distance/mileage;
    double totalCost=fuelNeeded*fuelPrice;
    System.out.println("Distance:"+distance+" km");
    System.out.println("Fuel Needed:"+fuelNeeded+" liters");
    System.out.println("Total Cost:"+totalCost);
  }
}
