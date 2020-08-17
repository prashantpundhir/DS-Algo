package string;

public class ValidPalidrome {

	public static void main(String[] args) {
		
		String s="A man, a plan, a canal: Panama";
		
		System.out.println(isValidPalindrome(s));

		

	}
	static Boolean isValidPalindrome(String s) {
		
	
		s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
		int i=0,n =s.length()-1;
		
		while(i<n) {
			
			if(s.charAt(i)!=s.charAt(n))
					return false;
			i++;
			n--;
		}
		
		return true;
	}

}
