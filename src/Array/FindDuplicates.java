package Array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

	public static void main(String[] args) {

		int[] nums= {1,2,3,4,5,6,6,7,3,9};
		
		List l= findDuplicates(nums);
		
		
	}

	public static List<Integer> findDuplicates(int[] nums) {

		List li = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[Math.abs(nums[i])] >= 0)
				nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
			else {
				System.out.println(nums[i]);
				li.add(Math.abs(nums[i]));
			}
		}

		return li;

	}

}
