package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 45, 2, 34533, 32, 354, 4 };
		System.out.println(findLargest(arr));

	}

	public static int findLargest(int[] arr) {

		int n = arr.length;
		ArrayList<Integer> s = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
			if (!s.contains(arr[i]))
				s.add(arr[i]);

		Collections.sort(s);

		if (s.size() < 3)
			return s.get(s.size() - 1);
		return s.get(s.size() - 3);
	}

}
