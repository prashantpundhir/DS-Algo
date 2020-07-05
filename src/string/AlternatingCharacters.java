package string;

public class AlternatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "AAABBB";
		int count = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1))
				count++;
		}
		System.out.println(count);

		String s1 = "aabb";

		System.out.println(isValid(s1));

	}

	static String isValid(String s) {
		int[] letter = new int[26];

		for (char c : s.toCharArray()) {
			if (letter[c - 'a']== 1) {
				letter[c - 'a']--;
				System.out.println("In case 1 " + letter[c - 'a']);
			} else {
				letter[c - 'a']++;
				System.out.println("In case 0 " + letter[c - 'a']);

			}
			
		}
		
		System.out.println("c -a " + letter[ s.charAt(1) - 'a']);
		
		int count = 0;
		for (int i : letter) {
			count += Math.abs(i);
			if (count > 1)
				return "NO";
		}
		return "YES";
	}
}
