public class FirstNonRepeatedChar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to find FirstNonRepeatedChar");
		String s = sc.nextLine();
		char c = findFirstNonRepeatedChar(s);
		System.out.println("First Non Repeatitive char "+c);
		
		
		
	}

	private static Character findFirstNonRepeatedChar(String s) {
		
		HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
	
		Character c; 
		int length = s.length();
		for(int i=0;i<length;i++) {
			c=s.charAt(i);
			
			if(charMap.containsKey(c)) {
				charMap.put(c,charMap.get(c)+1);
			}else {
				charMap.put(c, 1);
			}
			
		}
		
		for(int i=0;i<length;i++) {
			c=s.charAt(i);
			if(charMap.get(c)==1)
				return c;
		}
		return null;
	}

}
