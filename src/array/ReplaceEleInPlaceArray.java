package array;

public class ReplaceEleInPlaceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 17, 18, 5, 4, 6, 1 };

		replaceGreatest(arr);

	}

	public static void replaceGreatest(int arr[]) {

		int s = arr.length;
		int rightMax = arr[s - 1];
		arr[s - 1] = -1;

		for (int i = s - 2; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = rightMax;

			if (rightMax < temp)
				rightMax = temp;

		}

		for (int i = 0; i < s; i++)
			System.out.print(arr[i] + " ");
	}

}
