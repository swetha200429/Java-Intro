class SupermarketBilling{
  public static void main(String[] args){
    double item1=450.75;
    double item2=320.50;
    double item3=199.99;
    double subtotal=item1+item2+item3;
    double gst=subtotal*0.18;
    double discount=subtotal*0.10;
    double finalAmount=subtotal+gst-discount;
    double paidAmount=2000;
    double change=paidAmount-finalAmount;
    int coins=(int)change%10;
    System.out.println("Subtotal:"+subtotal);
    System.out.println("GST:"+gst);
    System.out.println("Discount:"+discount);
    System.out.println("Final Amount:"+finalAmount);
    System.out.println("Change:"+change);
    System.out.println("Coins remaining (mod 10):"+coins);
  }
}   
