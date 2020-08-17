package array;

public class PairSumInSortedandRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 8, 9, 12, 1, 3, 4, 5, 7 };

		int target = 12;

		System.out.println(isPairSum(arr, target));

		System.out.println(countPairSum(arr, target));

	}

	public static boolean isPairSum(int[] arr, int target) {

		int n = arr.length;
		int i = 0;
		for (i = 0; i < n - 1; i++)
			if (arr[i] > arr[i + 1])
				break;

		int l = (i + 1) % n;
		int r = i;

		while (l != r) {
			if (arr[l] + arr[r] == target)
				return true;

			if (arr[l] + arr[r] < target)
				l = (l + 1) % n;
			else
				r = (r - 1 + n) % n;

		}

		return false;
	}

	public static int countPairSum(int[] arr, int target) {

		int count = 0;

		int n = arr.length;
		int i = 0;
		for (i = 0; i < n - 1; i++)
			if (arr[i] > arr[i + 1])
				break;

		int l = (i + 1) % n;
		int r = i;

		while (l != r) {
			if (arr[l] + arr[r] == target) {
				count++;

				if (l == (r + n - 1) % n)
					return count;

				l = (l + 1) % n;
				r = (n + r - 1) % n;
			}

			else if (arr[l] + arr[r] < target)
				l = (l + 1) % n;
			else
				r = (r - 1 + n) % n;

		}

		return count;
	}

}
