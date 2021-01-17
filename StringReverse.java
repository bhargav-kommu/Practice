import java.util.Scanner;

public class StringReverse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to Reverse :");
		String inputString =  sc.nextLine();
		
		for(int i=inputString.length()-1;i>=0;i--) {
			System.out.print(inputString.charAt(i));
			
		}
		
	}

}
