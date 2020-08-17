package string;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] stra = { "flower", "flow", "flight" };
		String[] strb = {"car","carefree" ,"free"};

		System.out.println("LCP: " + longestCommonPrefix(stra));
		System.out.println("LCP: " + longestCommonPrefix(strb));

	}

	public static String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length == 0)
			return "";

		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0)
				prefix = prefix.substring(0, prefix.length() - 1);

		}

		return prefix;

	}

}
