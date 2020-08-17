package array;

import java.util.*;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		while (t > 0) {
			String in = scan.nextLine();
			scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			String[] ina = in.split(" ");

			int l = Integer.parseInt(ina[0]);
			int target = Integer.parseInt(ina[1]);

			int[] arr = new int[l];

			for (int i = 0; i < l; i++) {
				arr[i] = scan.nextInt();
				scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			}

			int[] sa = subArray(arr, target);
			for (int a : sa)
				System.out.print(a + " ");
			t--;
		}
		scan.close();
	}

	public static int[] subArray(int[] arr, int target) {
		int start = 0;
		int sum = 0;
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == target)
				break;
			while (sum > target && start < i - 1) {
				sum -= arr[start];
				start++;
			}
		}
		return new int[] { start, i };
	}

}
