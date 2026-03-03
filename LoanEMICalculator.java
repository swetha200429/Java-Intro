class LoanEMICalculator{
  public static void main(String[] args){
    long principle=500000;
    double annualInterestRate=8.5;
    int timeInYears=5;
    double monthlyrate=annualInterestRate/(12*100);
    int months=timeInYears*12;
    double emi=(principle*monthlyRate*Math.pow(1+monthlyrate,months))/(Math.pow(1+monthlyRate,months)-1);
    System.out.println("Loan Amount:"+principal);
    System.out.println("Monthly EMI:"+emi);
  }
}   
