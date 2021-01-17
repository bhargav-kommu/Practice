import java.util.HashSet;
import java.util.Scanner;

public class UniqueCharInString {

	public static void main(String[] args) {
		boolean result = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name to check for special Charecter");
		String input = sc.nextLine();
		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i < input.length(); i++) {
			result = set.add(input.charAt(i));
			if (result == false)
				break;

		}
		System.out.println(result);
	}
}
