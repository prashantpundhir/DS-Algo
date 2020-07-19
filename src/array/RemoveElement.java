package array;

public class RemoveElement {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7 };
		int val = 7;

		System.out.println(removeEle(arr, val));

	}

	public static int removeEle(int arr[], int val) {

		int i = 0;
		int n = arr.length;
		while (i < n) {
			if (arr[i] == val) {
				arr[i] = arr[n - 1];
				n--;
			} else
				i++;

		}

		for (int j = 0; j < n; j++)
			System.out.print(arr[j] + " ");
		System.out.println("");
		return n;

	}
}
