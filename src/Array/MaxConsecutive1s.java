
public class MaxConsecutive1s {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0 };
		System.out.println(findMaxConsecutiveOnes(arr));
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0)
				count = 0;
			else {
				count++;
				if (max < count)
					max = count;
			}
		}

		return max;
	}
}
