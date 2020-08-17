package array;

public class PartitionArrayInto3EqualSum {

//	Given an array of n integers, we have to partition the array into three segments such
//	that all the segments have equal sum. Segment sum is the sum of all the elements in segment.

	public static int pos1 = -1, pos2 = -1;

	public static void main(String[] args) {

		int arr[] = { 1, 3, 6, 2, 7, 1, 2, 8};
		equiSum(arr);

	}

	public static void equiSum(int arr[]) {

		boolean flag = isEquiPossible(arr);
		if (flag) {
			
			for(int i=0; i<=pos1;i++)
				System.out.print(arr[i]+" ");
			
			 System.out.println();
			
			 for(int i=pos1+1; i<pos2;i++)
				System.out.print(arr[i]+" ");

			System.out.println();

			for(int i=pos2; i<arr.length;i++)
				System.out.print(arr[i]+" ");

			 System.out.println();

		} else
			System.out.println("Partition Not Possible");

	}

	public static boolean isEquiPossible(int arr[]) {

		int n = arr.length;
		int sum = 0;
		int pre[] = new int[n];
		int suff[] = new int[n];

		for (int i = 0; i < n; i++) {
			sum += arr[i];
			pre[i] = sum;
		}

		sum = 0;
		for (int i = n - 1; i >=0; i--) {
			sum += arr[i];
			suff[i] = sum;
		}

		int totalSum = sum;
		int i = 0;
		int j = n - 1;

		while (i < j - 1) {

			if (pre[i] == totalSum / 3)
				pos1 = i;
			if (suff[j] == totalSum / 3)
				pos2 = j;

			if (pos1 != -1 && pos2 != -1) {
				if (suff[pos1 + 1] - suff[pos2] == totalSum / 3)
					return true;
				else
					return false;
			}

			if (pre[i] < suff[j])
				i++;
			else
				j--;

		}

		return false;
	}

}
