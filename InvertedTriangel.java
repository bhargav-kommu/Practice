// this program will pring inverted trangle pattern
public class InvertedTriangel {

	
	public static void main(String[] args) {
	int a,b,size=15;
	
		for (a = size; a >= 0; a--) {

			for (b = a; b < size; b++)
				System.out.print("V");

			/*for (b = 1; b <= ((a * 2) - 1); b++)
				System.out.print("A");*/
			System.out.print("\n");
		}
	}
}
