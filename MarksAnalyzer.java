import java.util.Scanner;
public class marksAnalyzer{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of students:");
    int n=sc.nextint();
    int[] marks=new int[n];
    int highest=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      System.out.println("Enter mark:");
      marks[i]=sc.nextInt();
      if(marks[i]>highest){
        highest=marks[i];
      }
    }
    System.out.println("Highest mark:"+highest);
    sc.close();
  }
}
