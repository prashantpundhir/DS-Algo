package array;

public class FindSmallestPositiveWith_le_0_Elements {

	public static void main(String[] args) {
		int[] nums = {1,1 };
		System.out.println(findPositive(nums));
	}

	public static int findPositive(int nums[]) {
		
		int positiveStartIndex = segregate(nums);
		int smallestPositive = find(nums, positiveStartIndex);
		return smallestPositive;
	}

	public static int find(int[] nums, int start) {
		int num = 0;
		for (int i = start; i < nums.length; i++) {
			int n = Math.abs(nums[i]) - 1;
			if ((n + start) >= start && (n + start) < nums.length)
				nums[n + start] = -nums[n + start];
		}
		for (int i = start; i < nums.length; i++) {
			if (nums[i] > 0)
				return i - start + 1;
		}
		num = nums.length - start + 1;
		return num;
	}

	public static int segregate(int[] nums) {
		int j = 0;
		int i = 0;
		int n = nums.length - 1;
		while (i <= n) {
			if (nums[i] <= 0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			} else
				i++;
		}
		return j;
	}
}
