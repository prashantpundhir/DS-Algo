package string;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringLengthWithoutDuplicate {

	public static final void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "phwphjjj"; // 4

		System.out.println(lengthLongestSubstring(s));

	}

	public static int lengthLongestSubstring(String s) {

		int len = 0;

		int l = 0;
		int r = 0;

		Set<Character> set = new HashSet<>();

		while (r < s.length()) {

			if (!set.contains(s.charAt(r))) {
				set.add(s.charAt(r));
				len = Math.max(len, set.size());

				r++;

			} else {
				set.remove(s.charAt(l));
				l++;

				
			}
		}

		return len;
	}

}
