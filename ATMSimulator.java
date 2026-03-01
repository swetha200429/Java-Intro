import java.util.Scanner;
public class ATMSimulator{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double balance=10000;
    System.out.println("1.Check Balance");
    System.out.println("2. Deposite");
    System.out.println("3. Withdraw");
    System.out.print("Choose option:");
    int choice=sc.newxtInt();
    switch(choice){
      case 1:
        System.out.println("Balance:"+balance);
        break;
      case 2:
        System.out.println("Enter deposite amount:");
        double deposite=sc.nextDouble();
        balance+=deposite;
        System.out.println("Updated Balance:"+balance);
        break;
      case 3:
        System.out.println("Enter withdraw amount:");
        double withdraw=sc.nextDouble();
        if(withdraw<=balance){
          balance-=withdraw;
          System.out.println("Updated Balance:"+balance);
        }else{
          System.out.println("Insufficient balance");
        }
        break;
      default:
        System.out.println("Invalid choice");
    }
    sc.close();
  }
}        
