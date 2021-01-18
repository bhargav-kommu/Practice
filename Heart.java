// this program will print heart pattern
public class Heart {

	
	public static void main(String[] args) {
		
		int a,b,size=15;
		
		for(a=size/2;a<=size;a=a+2){
		
			for(b=1; b<size-a; b=b+2)
				System.out.print(" ");
			for(b=1;b<=a;b++)
				System.out.print("A");
			for(b=1;b<=size-a;b++)
				System.out.print(" ");
			for(b=1;b<=a-1;b++)
				System.out.print("A");
			System.out.print("\n");
			
		}
		
		
		for(a=size;a>=0;a--){
			
			for(b=a;b<size;b++)
				System.out.print(" ");
			
			for(b=1;b<=((a*2)-1);b++)
				System.out.print("V");
			System.out.print("\n");
		}
	}
}
