package queuesAndStacks;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "() {}[] {}([])";

		System.out.println(isBalanced(s));

	}

	static String isBalanced(String s) {

		Stack st = new Stack();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(')
				st.push(s.charAt(i));

			if (s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')') {
				if (st.isEmpty())
					return "NO";

				char ch = (Character) st.pop();
				if (!isMatching(ch, s.charAt(i)))
					return "NO";
			}
		}
		if (st.isEmpty())
			return "YES";
		else
			return "NO";

	}

	public static Boolean isMatching(Character character1, Character character2) {

		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

}
