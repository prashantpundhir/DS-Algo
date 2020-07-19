package array;

import java.util.ArrayList;

public class DuplicateZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 0, 3, 5, 0, 8, 6, 7 };
		DuplicateZeros dz = new DuplicateZeros();
		dz.duplicateZeros(arr);
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");

	}

	public void duplicateZeros(int[] arr) {
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				a.add(0);
				a.add(0);

			} else
				a.add(arr[i]);

		}

		for (int i = 0; i < arr.length; i++)
			arr[i] = a.get(i);

	}

}
