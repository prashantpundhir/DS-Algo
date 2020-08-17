package array;

import java.util.ArrayList;

public class PolicemenCatchThieves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] arr = { 'P', 'T', 'T', 'P', 'T' };
		int k = 1;

		System.out.println(findThieves(arr, k));

	}

	public static int findThieves(char[] arr, int k) {

		int res = 0;

		ArrayList<Integer> t = new ArrayList<>();
		ArrayList<Integer> p = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'P')
				p.add(i);
			if (arr[i] == 'T')
				t.add(i);
		}

		int l = 0, r = 0;

		while (l < t.size() && r < p.size()) {

			if (Math.abs(p.get(r) - t.get(l)) <= k) {
System.out.println("p:"  + p.get(r) +" t:"+t.get(l));
				
				res++;
				l++;
				r++;

			} else if (t.get(l) < p.get(r))
				l++;
			else
				r++;

		}

		return res;
	}

}
