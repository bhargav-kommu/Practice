import java.util.HashSet;

public class SumOfElementsEqualToGivenNumber {
	
	public static void main(String[] args) {
		
		int numbers[] = {1,5,45,6,10,16,8};
		int n = 11;
		check(numbers,n);
		
	}

	private static void check(int[] numbers, int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			int temp = n - numbers[i];
			if(set.contains(temp)) {
				System.out.println(n +":pair:"+numbers[i]+","+temp);
			}
			set.add(numbers[i]);
			
		}
	}

}
