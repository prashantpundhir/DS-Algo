package sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print elements with merge sort logic

		int arr1[] = { 223, 242, 451, 461, 652, 1323, 4462, 56767 };
		int arr2[] = { 434, 461, 4341, 4354, 6523, 21111 };

		mergeSort(arr1, arr2);
	}

	public static void mergeSort(int[] a1, int[] a2) {

		int i = 0;
		int j = 0;
		int m = a1.length;
		int n = a2.length;

		while (i < m && j < n) {
			if (a1[i] < a2[j]) {
				System.out.print(a1[i] + ", ");
				i++;
			} else {
				System.out.print(a2[j] + ", ");
				j++;
			}

		}

		while (i < m) {
			System.out.print(a1[i++] + ", ");
		}
		while (j < n)
			System.out.print(a2[j++] + ", ");
	}
}
