package array;

public class FindRowWithMax1s {

	public static void main(String[] args) {

		int arr[][] = { { 0, 0, 1, 1, 1 }, 
						{ 0, 0, 0, 0, 1 },
						{ 0, 0, 0, 0, 1 },
						{ 0, 0, 1, 1, 1 }, 
						{ 0, 1, 1, 1, 1 },
						{ 0, 0, 1, 1, 1 } };

		System.out.println(findMax1s(arr));

	}

	public static int findMax1s(int[][] arr) {
		int n = arr.length;
		int col = n == 0 ? 0 : arr[0].length;
		int j = col - 1;
		int i = 0, row = 0;

		while (i < n && j >= 0) {

			if (arr[i][j] == 1) {
				row = i;
				j--;
			} else
				i++;
		}
		return row;
	}

}