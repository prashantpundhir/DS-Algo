package Array;

public class ArrayReverse {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;

		reverseArr(arr, n);
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

	}

	public static void reverseArr(int arr[], int n) {

		for (int i = 0; i < n / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;

		}

	}

}
