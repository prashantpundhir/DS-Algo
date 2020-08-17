package Array;

public class SortArrayByParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 4, 3, 5, 5, 6, 7, 8 };
		int[] sorted = sortParity(arr);

		for (int i : sorted)
			System.out.print(i + " ");
	}

	public static int[] sortParity(int[] arr) {

		int i = 0, j = arr.length - 1;
		while (i < j) {
			if (arr[i] % 2 > arr[j] % 2) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[i] % 2 == 0)
				i++;
			if (arr[j] % 2 == 1)
				j--;
		}
		return arr;
	}

}
