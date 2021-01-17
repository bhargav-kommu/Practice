import java.util.Scanner;

// this programs is to find the number given word count in a sentance
public class WordCount {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String : ");
		String input = s.next();
		int count=0;
		
		for(int i=0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i)) || Character.isLetter(input.charAt(i)) || input.charAt(i)==' '){
				continue;
			}else {
				System.out.println(input +" is not a valid input");
				return;
			}
		}
		
		System.out.println("Enter Sentance");
		s.nextLine();
		String sentance = s.nextLine();
		String[] words = sentance.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			if(words[i].equalsIgnoreCase(input)) {
				count++;
			}
		}
		
		
		System.out.println("wordcount "+count);
		
		
	}

}
