package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DisappearedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };

		List<Integer> l = new ArrayList<Integer>();

		l = findNum(arr);

		for (Integer i : l)
			System.out.print(i + " ");

	}

	public static List<Integer> findNum(int[] arr) {

		List<Integer> li = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			int val = Math.abs(arr[i]) - 1;
			if (arr[val] > 0)

				arr[val] = -arr[val];
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				li.add(i + 1);
				// System.out.print(i + 1 + " ");
			}
		}

		return li;

	}

}
