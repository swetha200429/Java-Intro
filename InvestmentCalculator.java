class InvestmentCalculator{
  public static void main(String[] args){
    long priciple=5000000L;
    double rate=7.5;
    int years=5;
    float bonusRate=1.2f;
    double amount=principle*Math.pow((1+rate/100),years);
    double finalamount=amount+(amount*bonusRate/100);
    System.out.println("Principal:"+principal);
    System.out.println("Final Amount after"+years+"years:"+finalAmount);
  }
}
