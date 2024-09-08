package string;

public class RemDupCount {

	//Remove duplicate without for-loop
	
	String dup="";
	int i=0;
	int count;
	
	void remDup() {
		
		String s="programming";
		
		if((i<s.length()) && !dup.contains(String.valueOf(s.charAt(i)))){
			
			dup = dup+s.charAt(i);
			i++;
			remDup();
			
		}
		else if((i<s.length()) && dup.contains(String.valueOf(s.charAt(i)))){
			
			i++;
			count++;
			remDup();
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemDupCount rem=new RemDupCount();
		
		rem.remDup();
		
		System.out.println(rem.dup);
		System.out.println(rem.count);
		
	}

}
