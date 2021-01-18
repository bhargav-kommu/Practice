import java.util.Scanner;

public class IntegerPalendrome {
	
	public static void main(String[] args) {

		System.out.println("Enter a number to check palendrome number");
		int s = new Scanner(System.in).nextInt();
		System.out.println("Given number :" + s);
		
	
		if (isPalndrome(s)) 
			System.out.print("IS Palindrome ? : YES");
		else
			System.out.print("IS Palindrome ? : NO");


	}

	private static boolean isPalndrome(int s) {
		int a = s;
		boolean res = false;
		int rev = 0;

		while (s != 0) {
			int remainder = s % 10;
			System.out.println("Remainder " + remainder);
			rev = rev * 10 + remainder;
			System.out.println("Reverse " + rev);
			s = s / 10;
			System.out.println("Actual value " + s);
			System.out.println();
		}

		return a==rev?true:false;

	}

}
