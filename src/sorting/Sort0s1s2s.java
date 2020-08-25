package sorting;

public class Sort0s1s2s {

	public static void main(String[] args) {
		// 1. sort arr,
		// 2. count 0,1,2
		// 3. if 0, swap it with mid, l++,mid++, if 1 mid++, if 2 place it in the nth pos, n--

		int arr[] = { 0, 1, 0, 1, 2, 0, 1, 2, 1, 0, 1, 0, 1, 2, 0, 0, 0, 1, 1, 2, 0, 1, 2, 0, 1 };

		sort(arr);

		for (int a : arr)
			System.out.print(a + " ");

	}

	static void sort(int[] arr) {

		int l = 0, mid = 0, n = arr.length - 1, temp = 0;
		while (mid <= n) {
			if (arr[mid] == 0) {
				temp = arr[l];
				arr[l] = arr[mid];
				arr[mid] = temp;
				l++;
				mid++;
			}
			else if (arr[mid] == 1)
				mid++;

			else if (arr[mid] == 2) {
				temp = arr[n];
				arr[n] = arr[mid];
				arr[mid] = temp;
				n--;

			}

		}

	}

}