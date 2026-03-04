class FoodOrderBilling{
  public static void main(String[] args){
    String itemName="Pizza";
    int quantity=3;
    double price=249.50;
    double total=quantity*price;
    String bill="Item:"+itemName+"\nQuantity:"+quantity+"\nPrice per item:"+price+"\nTotal Amount:"+total;
    System.out.println("----- FOOD BILL -----");
    System.out.println(bill);
  }
}
