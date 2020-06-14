package Array;

public class SearchElementInSortedNRotatedArray {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 6, 7, 9, 1, 2 };
		int key = 2;
		int n = arr.length;

		System.out.println(findElement(arr, n, key));

	}

	public static int findElement(int[] arr, int n, int key) {

		int pivot = findPivot(arr, 0, n - 1);

		if (pivot == -1)
			return BinarySearch(arr, 0, n - 1, key);

		if (arr[pivot] == key)
			return pivot;
		if (arr[0] <= key)
			return BinarySearch(arr, 0, pivot - 1, key);
		return BinarySearch(arr, pivot + 1, n - 1, key);
	}

	public static int findPivot(int[] arr, int l, int r) {

		if (l > r)
			return -1;

		if (l == r)
			return l;

		int mid = (l + r) / 2;

		if (mid < r && arr[mid] > arr[mid + 1])
			return mid;
		if (mid > l && arr[mid] < arr[mid - 1])
			return mid - 1;
		if (arr[l] >= arr[mid])
			return findPivot(arr, l, mid - 1);
		return findPivot(arr, mid + 1, r);

	}

	public static int BinarySearch(int arr[], int l, int h, int key) {

		if (h < l)
			return -1;
		int mid = (l + h) / 2;

		if (arr[mid] == key)
			return mid;
		if (arr[mid] > key)
			return BinarySearch(arr, l, mid - 1, key);

		return BinarySearch(arr, mid + 1, h, key);
	}

}
