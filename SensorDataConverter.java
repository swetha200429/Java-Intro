class SensorDataConverter{
  public static void main(String[] args){
    double temperatureReading=36.987654;
    float floatValue=(float) temperatureReading;
    long longValue=(long) floatValue;
    int intValue=(int) longValue;
    System.out.println("Original Double:"+temperatureReading);
    System.out.println("After float casting:"+floatValue);
    System.out.println("After long casting:"+longValue);
    System.out.println("After int casting:"+intValue);
  }
}
