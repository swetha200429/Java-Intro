class MiniATM{
  public static void main(String[] args){
    int enteredPin=1234;
    int correctPin=1234;
    double balance=25000;
    double withdrawAmount=5000;
    if(enteredPin==correctPin){
      System.out.println("Login Successful!");
      if(withdrawAmount<=balance){
        balance-=withdrawAmount;
        System.out.println("Withdrawal Successful!");
      }
      else{
        System.out.println("Insufficient Balance!");
      }
      System.out.println("Remaining Balance:"+balance);
    }
    else{
      System.out.println("Invalid PIN!");
    }
  }
}
