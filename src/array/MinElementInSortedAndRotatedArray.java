package array;

public class MinElementInSortedAndRotatedArray {

	public static void main(String[] args) {
		int arr[] = { 7, 8, 9, 12, 15, 18, 3, 5, 6 };
		System.out.println(findMin(arr));

	}

	public static int findMin(int arr[]) {
		int l = 0;
		int h = arr.length - 1;

		while (l < h) {
			int mid = l + (h - l) / 2;

			if (arr[mid] == arr[h])
				h--;
			else if (arr[mid] > arr[h])
				l = mid + 1;
			else
				h = mid;

		}

		return arr[h];
	}

}
