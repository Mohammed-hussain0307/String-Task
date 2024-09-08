package string;

public class TitleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="HELLO WORLD";
		
		s=s.toLowerCase();
		
		String tit[]=s.split(" ");	
		
		for(int i=0; i<tit.length; i++) {
			
			System.out.print(tit[i].toUpperCase().charAt(0));
			System.out.print(tit[i].substring(1)+" ");
			
		}

	}

}
