package Array;

import java.util.Arrays;

public class Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 5, 3, 4, 2 };

		int k = 2;

		findPairs(arr, k);

	}

	public static void findPairs(int[] arr, int k) {

		int count = 0;

		Arrays.sort(arr);

		int i = 0, j = 1;

		while (j < arr.length) {
			int diff = arr[j] - arr[i];
			if (diff == k) {
				count++;
				j++;
			} else if (diff > k)
				i++;
			else
				j++;
		}

		System.out.println(count);

	}

}
