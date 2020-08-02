package practice;

import java.util.HashMap;

public class TwoSum {
//	This problem was recently asked by Google.
//	Given a list of numbers and a number k, return whether any two numbers 
//	from the list add up to k.
//	For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

	public static void main(String[] args) {
	
		int arr[] = { 10, 15, 3, 7 };
		int target = 17;
		int[] num = findPair(arr, target);
		System.out.print(num[0] + " , " + num[1]);
	
	}

	public static int[] findPair(int[] arr, int target) {

		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int complement = Math.abs(target - arr[i]);
			if (hm.containsKey(complement))
				return new int[] { hm.get(complement), i };
			else
				hm.put(arr[i], i);
		}

		throw new IllegalArgumentException("No pair found");
	}

}
