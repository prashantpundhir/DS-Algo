package string;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "HAHAHAH";
		
		System.out.println(isPalindrome(s));
		System.out.println(isPalindrome("Prashant"));

	}
	public static boolean isPalindrome(String s) {
		
		int i=0;
		int j=s.length()-1;
		
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
			
		}
		
		return true;
		
	}

}
