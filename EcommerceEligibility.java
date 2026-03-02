class EcommerceEligibility{
  public static void main(String[] args){
    boolean isLoggedin=true;
    boolean hasSubscription=true;
    double cartAmount=1500;
    double minimumAmount=1000;
    boolean isEligibleForDiscount=isLoggedIn && hasSubscription && cartAmount >= minimumAmount;
    System.out.println("Eligible for Premium Discount:"+isEligibleForDiscount);
  }
}
