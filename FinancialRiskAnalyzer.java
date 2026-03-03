class FinancialRiskAnalyzer{
  public static void main(String[] args){
    double stockValue=10567.987534553;
    float floatValue=(float) stockValue;
    int intValue=(int) stockValue;
    System.out.println("Original Stock Value (double):"+stockValue);
    System.out.println("After float casting:"+floatValue);
    System.out.println("After int casting:"+intValue);
    double precisionLoss=stockValue-floatValue;
    System.out.println("Precision Lost after float conversion:"+precisionLoss);
  }
}
