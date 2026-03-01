package Scanner;
import java.util.Scanner;
public class StudentGradeCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks for 3 subjects:");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int total=m1+m2+m3;
		double average=(double)total/3;
		System.out.println("Total Marks:"+total);
		System.out.println("Average:"+average);
		sc.close();
     }
}
