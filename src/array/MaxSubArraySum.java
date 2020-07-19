package array;

public class MaxSubArraySum {

	public static void main(String[] args) {

		int[] ar = { -1, 2,4,-3,5,2,-5,2 };
		int max = 0;
		for (int i = 0; i < ar.length; i++) {
			int s = 0;

			for (int j = i; j < ar.length; j++) {
				s += ar[j];
				max = Math.max(max, s);

			}

		}

		System.out.println(max);

	}

}
