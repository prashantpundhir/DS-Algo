package string;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "anagram";
		String t = "nagaram";

		System.out.println("Is Anagram: " + isAnagram(s, t));

		isAna(s, t);
	}

	public static boolean isAnagram(String s, String t) {

		if (s.length() != t.length())
			return false;

		int counter[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			counter[s.charAt(i) - 'a']++;
			counter[t.charAt(i) - 'a']--;
		}
		for (int count : counter) {
			if (count != 0)
				return false;
		}

		return true;
	}
	
	public static void isAna(String s, String t) {
		
		if(s.length()!= t.length())
			return;
		
		int ar[]=new int[26];
		int count =0;
		for(int i=0;i<s.length();i++) {
			ar[s.charAt(i)-'a']++;
		}
		for(int i=0;i<t.length();i++) {
			ar[t.charAt(i)-'a']--;
			if(ar[t.charAt(i)-'a']<0) {
				count=1;
				break;
			}
				
		}
		if(count==0)
			System.out.println("true");
		else
			System.out.println("false");
		
		
	}
	

}
