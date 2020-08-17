package array;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12 };
		int n = arr.length;

		System.out.println(findMissingNum(arr, n));
		System.out.println(findMissingNumWithXOR(arr, n));
		System.out.println(findMissingNumInSingleLoop(arr, n));

	}

	public static int findMissingNum(int[] arr, int n) {

		int total = (n + 1) * (n + 2) / 2;

		for (int i = 0; i < n; i++)
			total -= arr[i];

		return total;

	}

	public static int findMissingNumWithXOR(int[] arr, int n) {
		int a = arr[0], b = 1;

		for (int i = 1; i < n; i++)
			a = a ^ arr[i];

		for (int i = 2; i <= n + 1; i++)
			b = b ^ i;

		return a ^ b;

	}

	public static int findMissingNumInSingleLoop(int arr[], int n) {

		int total = 1;

		for (int i = 2; i <= (n + 1); i++) {
			total += i;
			total -= arr[i - 2];

		}

		return total;
	}

}
