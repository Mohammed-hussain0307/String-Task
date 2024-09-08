package string;

public class RemDup {

	public static void main(String[] args) {
		
		String s="programming";
		String dup="";
		
//		for(int i=0; i<s.length(); i++) {
//			
//			boolean check=false;
//			
//			for(int j=0; j<dup.length(); j++) {
//				
//				if(s.charAt(i)==dup.charAt(j)) {
//						
//					check = true;
//					
//				}
//				//System.out.println(dup.charAt(j));
//			}
//			
//			if(!check) {
//				
//				dup=dup+s.charAt(i);
//				//System.out.println(s.charAt(i));
//			}
//		}
//		
//		System.out.println(dup);
		
		int count=0;
		
		for(int i=0;i<s.length(); i++) {
				
				if(!dup.contains(String.valueOf(s.charAt(i)))) {
					
					dup= dup+s.charAt(i);
					
				}
				else {
					count++;
				}
		}
		
		System.out.println(dup);
		System.out.println(count);
	}

}
