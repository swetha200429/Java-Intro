public class InvoiceGenerate{
  public static void main(String[] args){
    String productName="Laptop;
    int quantity=2;
    double price=55000.50;
    double total=quantity*price;
    System.out.println("-------INVOICE-------");
    System.out.println("Product:"+productName);
    System.out.println("Quantity:"+quantity);
    System.out.println("Price per unit:"+price);
    System.out.println("Total Amount:"+total);
    System.out.println("----------------------");
  }
}
