import java.util.Scanner;

public class LCM {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day interval of Sam:");
		int n1 = sc.nextInt();
		System.out.println("Enter the day interval of Riya:");
		int n2 = sc.nextInt();
		if(n1<=0 || n2<=0)
		{
		System.out.println("Given interval is not valid");
		return;
		}
		int lcm;
		lcm = (n1 > n2) ? n1 : n2;
		while(true) {
		if( lcm % n1 == 0 && lcm % n2 == 0 ) {
		System.out.printf("Sam and Riya will have their dinner on day "+lcm);
		break;
		}
		++lcm;
		}
		}
	}
	 


