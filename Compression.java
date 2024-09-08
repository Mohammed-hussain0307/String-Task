package string;

public class Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aabccccdddaaffffff";
		int count=1;
		char c=0;
		
		for(int i=0; i<s.length(); i=i+count) {
			
			count=1;
			
			for(int j=i+1; j<s.length(); j++) {
				
				if(s.charAt(i)==s.charAt(j)) {
					
					count++;
					
				}
				else {
					
					System.out.print(s.charAt(i)+""+count);
					break;
					
				}
				
			}
			
			c=s.charAt(i);
			
		}
		
		System.out.print(c+""+count);
		
	}

}
