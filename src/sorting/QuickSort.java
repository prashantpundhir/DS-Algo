package sorting;

public class QuickSort {

	public static void main(String[] args) {

		int[] a = { 322, 43, 34, 22, 1, 546, 76, 74, 2, 78 };
		int n = a.length;

		quickSort(a, 0, n - 1);

		for (int i : a)
			System.out.print(i + " ");

	}

	static void quickSort(int a[], int low, int high) {

		if (low < high) {
			int pivot = partition(a, low, high);

			quickSort(a, low, pivot - 1);
			quickSort(a, pivot + 1, high);

		}
	}

	static int partition(int a[], int l, int h) {

		int i = l - 1;
		
		int pivot = a[h];

		for (int j = l; j < h; j++) {
			if (a[j] < pivot) {
				i++;

				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;

			}
		}

		int temp = a[i + 1];
		a[i + 1] = a[h];
		a[h] = temp;

		return i + 1;
	}

}
