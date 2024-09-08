package string;

public class Supstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "acd";
		
		for(int i=0; i<s.length(); i++) {
			
			for(int j=i+1; j<=s.length(); j++) {
				
				System.out.println(s.substring(i,j));
				break;
			}
			
		}
		
		for(int i=0; i<s.length(); i++) {
					
					for(int j=i+2; j<=s.length();j++) {
						
						System.out.println(s.substring(i,j));
						break;
					}
					
				}
	
		for(int i=0; i<s.length(); i++) {
			
			for(int j=i+3; j<=s.length(); j++) {
				
				System.out.println(s.substring(i,j));
				break;
			}
			
		}
	
	}

}
