public class Fiibnocci {

	
	
	public static void main(String[] args) {
		int i =0,j=1;
		
		System.out.print(i+" "+j);
		
		for (int a = 0; a < 100; a++) {
			
			int k = i+j;
			i=j;
			j=k;
			System.out.print(" "+k);
		}
		
	}
}
