package matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = { { 1, 2, 3, 4, 5 }, 
						{ 6, 7, 8, 9, 10 }, 
						{ 11, 12, 13, 14, 15 }, 
						{ 16, 17, 18, 19, 20 },
						{ 21, 22, 23, 24, 25 }, 
						{ 26, 27, 28, 29, 30 } };

		List<Integer> li = spiralMatrix(arr);
		System.out.println(li);
	}

	static List<Integer> spiralMatrix(int arr[][]) {
		List<Integer> li = new ArrayList<>();

		if (arr == null && arr.length == 0)
			return li;

		int top = 0, left = 0, right = arr[0].length - 1, bottom = arr.length - 1;

		int n = arr.length * arr[0].length;

		while (li.size() < n) {

			for (int i = left; i <= right && li.size() < n; i++)
				li.add(arr[top][i]);
			top++;

			for (int i = top; i <= bottom && li.size() < n; i++)
				li.add(arr[i][right]);
			right--;

			for (int i = right; i >= left && li.size() < n; i--)
				li.add(arr[bottom][i]);
			bottom--;

			for (int i = bottom; i >= top && li.size() < n; i--)
				li.add(arr[i][left]);
			left++;

		}

		return li;
	}

}
