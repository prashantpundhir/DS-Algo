package array;

public class RemoveDuplicatesfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 1, 2, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 8, 8, 8, 8, 9, 10 };
		removeDuplicatesInSortedArray(arr);

	}

	public static void removeDuplicatesInSortedArray(int[] arr) {

		int numOfDistinctDigit = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || arr[i] != arr[i - 1])
				numOfDistinctDigit++;
		}

		int[] resultArray = new int[numOfDistinctDigit];
		int resPosition = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || arr[i] != arr[i - 1]) {
				resultArray[resPosition] = arr[i];
				resPosition++;
			}
		}

		for (int i = 0; i < numOfDistinctDigit; i++) {
			System.out.print(resultArray[i] + " ");
		}
	}

}
