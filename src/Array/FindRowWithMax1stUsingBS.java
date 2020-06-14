package Array;

public class FindRowWithMax1stUsingBS {

	public static void main(String[] args) {

		int arr[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 1 }, { 0, 1, 1, 1 },

				{ 0, 0, 1, 1 } };

		System.out.println("Row with max 1's using binary search is: " + findMax1s(arr));

	}

	public static int findMax1s(int[][] arr) {
		int n = arr.length;
		int c = n == 0 ? 0 : arr[0].length;
		int i = 0, j = c - 1, row = 0;

		while (i < n && j >= 0) {

			j = startIndexBS(arr[i], 0, j);
			row = i;
			i++;

			while (i < n && arr[i][j] == 0)
				i++;

		}

		return row;
	}

	public static int startIndexBS(int arr[], int begin, int end) {

		while (begin < end) {
			// int mid = (begin + end) / 2;
			int mid = begin + (end - begin) / 2;
//			begin + (end - begin )/2;
			

			if (arr[mid] == 0 && arr[mid + 1] == 1)
				return mid + 1;
			if (arr[mid] == 0)
				begin = mid + 1;
			else
				end = mid;

		}

		return begin;

	}

}
