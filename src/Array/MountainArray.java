package Array;

public class MountainArray {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 7, 9, 5, 4, 3 };

		System.out.println("Is given array a Mountain Array: " + isValidMountain(arr));

	}

	public static Boolean isValidMountain(int arr[]) {
		int i = 0;
		int n = arr.length;

		//walk up
		while (i + 1 < n && arr[i] < arr[i + 1])
			i++;

		if (i == 0 || i == n - 1)
			return false;
		
		//walk down
		while( i + 1<n &&  arr[i]>arr[i+1])
			i++;

			return i == n - 1;
	}

}
