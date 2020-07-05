package Array;

public class ArrayRotateUsingReverse {

	public static void main(String[] args) {
		int arr[] = {-1,-100,3,99};
		int n = arr.length;
		int d = 5;

		rotateArray(arr, n, d);

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

	}

	static void rotateArray(int arr[], int n, int d) {
		
		if(d>n)
			d=d%n;
		
		reverseArray(arr, 0, d - 1);
		reverseArray(arr, d, n - 1);
		reverseArray(arr, 0, n - 1);

	}

	static void reverseArray(int ar[], int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
		}

	}

}
