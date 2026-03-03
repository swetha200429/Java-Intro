class SmartBilling{
  public static void main(String[] args){
    var itemName="Smartphone";
    var quantity=2;
    var price=25000.75;
    var gstRate=0.18;
    var subtotal=quantity*price;
    var gst=subtotal*gstRate;
    var total=subtotal+gst;
    System.out.println("Item:"+itemName);
    System.out.println("Subtoatal:"+subtotal);
    System.out.println("GST:"+gst);
    System.out.println("Total Amount:"+total);
  }
}
