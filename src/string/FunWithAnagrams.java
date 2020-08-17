package string;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FunWithAnagrams {
	public static String key(String word) {
		char[] chrs = word.toCharArray();
		Arrays.sort(chrs);
		return new String(chrs);
	}

	public static List<String> funWithAnagrams(List<String> s) {
		List<String> ans = new LinkedList<String>();
		Set<String> found = new HashSet<String>();
		for(int i = 0; i < s.size(); i++) {
			String word = s.get(i);
			String key = key(word);
			if (!found.contains(key)) {
				ans.add(word);
				found.add(key);
			}
		}
	
		Collections.sort(ans);
		return ans;
	
	}

	public static void main(String[] args) throws FileNotFoundException {
	
	List<String> a = Arrays.asList("code", "aaagmnrs", "anagrams", "doce");
	System.out.println(funWithAnagrams(a));


	}

}