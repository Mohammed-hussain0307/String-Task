package string;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="listen";
		String s2="silent";
		int count = 0;
		
		for(int i=0; i<s1.length(); i++) {
		
			for(int j=0;j<s2.length();j++) {
			
				if(s1.charAt(i)==s2.charAt(j)) {
					
					count++;
					
				}
			}
		}
		
		if(count==s1.length()) {
			
			System.out.println("true");
			
		}
		else {
			
			System.out.println("false");
			
		}
		
	}

}
