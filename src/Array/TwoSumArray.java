package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {

	public static void main(String[] args) {

		int nums[] = { 2, 4, 5, 6, 7, 8, 5 };
		int target = 10;

		int sol[] = findTwoSum(nums, target);
		
		System.out.println(sol[0] + " " + sol[1]);

	}

	public static int[] findTwoSum(int[] nums, int target) {

		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (mp.containsKey(complement)) {
				return new int[] { mp.get(complement), i };
			}
			mp.put(nums[i], i);

		}

		throw new IllegalArgumentException("No two sum solution");
	}
}
