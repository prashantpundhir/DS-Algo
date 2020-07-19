package array;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 0, 2, 3, 4, 5, 6, 7, 8, 21, 22, 35, 38, 48, 75, 99, 101, 105 };
		int val = 101;
		bin_Search(arr, val);

	}

	public static void bin_Search(int arr[], int val) {
		int lower = 0;
		int upper = arr.length - 1;
		int mid = 0;

		Boolean flag = false;
		while (lower <= upper) {
			mid = (lower + upper) / 2;

			if (arr[mid] == val) {
				flag = true;
				break;
			}
			if (arr[mid] > val)
				upper = mid - 1;
			else
				lower = mid + 1;

		}

		if (flag)
			System.out.println("Value found at " + mid + " position");

		else
			System.out.println("Value not found");

	}

}
