class ShoppingCart{
  public static void main(String[] args){
    String customerName="Swetha";
    double item1=1500.75;
    double item2=2300.50;
    double item3=999.99;
    double subtotal=item1+item2+item3;
    double discountRate=0.10;
    double discount=subtotal*discountRate;
    double finalAmount=subtotal-discount;
    System.out.print("Customer:"+customerName);
    System.out.println("Subtotal:"+subtotal);
    System.out.println("Discount:"+discount);
    System.out.println("Final Amount:"+finalAmount);
  }
}
