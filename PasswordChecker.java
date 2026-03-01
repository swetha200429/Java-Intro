package Scanner;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter password:");
		String password=sc.nextLine();
		boolean lengthCheck=password.length()>=8;
		boolean hasNumber=password.matches(".*\\d.*");
		if(lengthCheck && hasNumber) {
			System.out.println("Strong Password");
		}
		else {
			System.out.println("Weak Password");
		}
		sc.close();

	}

}
