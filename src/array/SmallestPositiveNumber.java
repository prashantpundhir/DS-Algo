package array;

public class SmallestPositiveNumber {

	public static void main(String[] args) {

		int[] arr = { 7, 6, 1, 2, 5, 4, 3, 9, 8, 12, 15, 10 }; // output: 3,
		System.out.println(smallestPositiveNumber(arr));

	}

	public static int smallestPositiveNumber(int[] arr) {
		int num = 0;

		for (int i = 0; i < arr.length; i++) {
			int n = Math.abs(arr[i]) - 1;
			if (n >= 0 && n < arr.length)
				arr[n] = -arr[n];

		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				num = i + 1;
				break;
			}
		}

		if (num == 0)
			num = arr.length + 1;
		return num;
	}

}
