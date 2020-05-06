package Array;

public class ArrayRotateUsingReverse {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 6, 8, 7, 5, 10 };
		int n = arr.length;
		int d = 3;

		rotateArray(arr, n, d);

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

	}

	static void rotateArray(int arr[], int n, int d) {
		reverseArray(arr, 0, d - 1);
		reverseArray(arr, d, n - 1);
		reverseArray(arr, 0, n - 1);

	}

	static void reverseArray(int arr[], int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
