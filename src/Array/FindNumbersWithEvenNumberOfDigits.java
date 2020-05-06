package Array;

public class FindNumbersWithEvenNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 12, 156, 356, 649, 1515, 656525, 52 };

		System.out.println(findNumber(arr));

	}

	public static int findNumber(int arr[]) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];

			String str = Integer.toString(num);
			if (str.length() % 2 == 0)
				count++;
		}

		return count;
	}

}
