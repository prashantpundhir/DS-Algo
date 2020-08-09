package array;

public class MaxAdjacentSum {

	public static void main(String[] args) {

		MaxAdjacentSum sum = new MaxAdjacentSum();
		int arr[] = new int[] { 5, 5, 10, 100, 10, 5 };
		System.out.println(sum.FindMaxSum(arr, arr.length));

	}

	public int FindMaxSum(int[] arr, int n) {

		int curr = arr[0];
		int exclude = 0;
		int newexclude;

		for (int i = 1; i < n; i++) {
			newexclude = Math.max(exclude, curr);
			curr = exclude + arr[i];
			exclude = newexclude;

		}

		return Math.max(exclude, curr);
	}

}
