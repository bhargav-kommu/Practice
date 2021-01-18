import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {

		int arr[] = { 9, 7, 1, 2, 2, 3, 4, 4, 4, 5, 5 };

		Set<Integer> set = new HashSet<>();

		for (int i : arr) {
			set.add(i);
		}

		Object[] n = set.toArray(new Integer[set.size()]);

		for (Object o : n) {
			System.out.println(o);
		}

	}

}
