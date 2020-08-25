package sorting;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = { 212, 423, 445, 46, 65, 524, 1, 2131, 34 };

		insertionSort(arr);

	}

	static void insertionSort(int a[]) {

		int n = a.length;

		for (int i = 1; i < n; i++) {

			int key = a[i];

			int j = i - 1;

			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;

			}
			a[j + 1] = key;
		}

		for (int num : a)
			System.out.print(num + " ");

	}

}
