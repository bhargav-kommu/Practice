// this program checks if the given input is number or not
public class Numeric {

	public static void main(String[] args) {

		String n = "12342f34";
		boolean flag = true;

		try {
			double d = Double.parseDouble(n);
		} catch (NumberFormatException e) {
			flag = false;
		}

		if (flag) {
			System.out.println("it's a number");
		} else {
			System.out.println("it's not a number");
		}

	}

}
