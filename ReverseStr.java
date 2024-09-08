package string;

public class ReverseStr {

	public static void main(String[] args) {
		
		
		String s1="hussain";
		char rev1 = 0;
		
		for(int i=s1.length()-1; 0<=i; i--) {
			
			rev1=s1.charAt(i);
			
			System.out.print(rev1);
			
		}
		System.out.println("\n ");

		//Find the value Palindrome or Not
		
		String s="Malayalam";
		char rev = 0;
		
		for(int i=s.length()-1; 0<=i; i--) {
			
			rev=s.charAt(i);
			
			System.out.print(rev);
			
		}
		
		String reverse="";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			reverse=reverse+s.charAt(i);
			
		}
		
		if(s.equalsIgnoreCase(reverse)) {
			System.out.println("\npalindrome");
		}
		else {
			System.out.println("\nNot palindrome");
		}
	}

}
