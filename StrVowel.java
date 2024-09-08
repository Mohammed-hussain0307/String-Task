package string;

public class StrVowel {

	public static void main(String[] args) {
		
		String s="hussain";
		char vowel=0;
		int count=0, cons=0;
		
		for(int i=s.length()-1; i>=0; i--) {
			
			vowel=s.charAt(i);
			
			if(vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u') {
				
				count++;
				
			}
			else {
				
				cons++;
				
			}
			
		}
		
		System.out.println("Vowels count    : "+count);
		System.out.println("Consonant count : "+cons);

	}

}
