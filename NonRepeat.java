package string;

public class NonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "swiss";
		
		for(int i=0; i<s.length(); i++) {
			
			boolean c=true;
			
			for(int j=0; j<s.length(); j++) {
				
				if(i!=j && s.charAt(i)==s.charAt(j)) {
					
					c=false;
					
				}
	
			}
			
			if(c) {
				
				System.out.println(s.charAt(i));
				break;
				
			}

		}
		
		for(int i=0;i<s.length();i++) {
			
			int check=0;
			
			for(int j=i+1; j<s.length(); j++) {
				
				if(s.charAt(i)==s.charAt(j)) {
					
					check++;
					
				}
				
			}
			
			if(check==0) {
				
				System.out.println(s.charAt(i));
				break;
				
			}
			
		}
		
	}

}
