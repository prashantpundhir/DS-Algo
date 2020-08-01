package array;

public class FindSmallestPositiveWith_le_0_Elements {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1, 0, 6, 7, 8, 10, 11, -11, -2 };
		System.out.println(findPositive(arr));
	}

	public static int findPositive(int arr[]) {
		int positiveStartIndex = segregate(arr);
		int smallestPositive = find(arr, positiveStartIndex);
		return smallestPositive;
	}

	public static int find(int[] arr, int start) {
		int num = 0;
		for (int i = start; i < arr.length; i++) {
			int n = Math.abs(arr[i]) - 1;
			if ((n + start) >= start && (n + start) < arr.length)
				arr[n + start] = -arr[n + start];
		}
		for (int i = start; i < arr.length; i++) {
			if (arr[i] > 0)
				return i - start + 1;
		}
		num = arr.length - start + 1;
		return num;
	}

	public static int segregate(int[] arr) {
		int j = 0;
		int i = 0;
		int n = arr.length - 1;
		while (i <= n) {
			if (arr[i] <= 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			} else
				i++;
		}
		return j;
	}
}
