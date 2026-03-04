class SmartLoanApproval{
  public static void main(String[] args){
    int creditScore=720;
    double salary=50000;
    int existingLoans=1;
    double requestedLoan=200000;
    double interestRate=0.08;
    int years=5;
    double emi=(requestedLoan*interestRate)/years;
    boolean approved=creditScore>=700 && salary>=30000 && existingLoans<2 && emi<(salary*0.40);
    System.out.println("Calcualted EMI:"+emi);
    System.out.println("Loan Approved:"+approved);
  }
}
