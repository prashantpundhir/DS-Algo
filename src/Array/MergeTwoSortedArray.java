package Array;

public class MergeTwoSortedArray {

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5,6};

		merge(nums1, nums2);

		for(int i=0; i<nums1.length;i++)
			System.out.print(nums1[i] + " ");
//		
	}

	 static void merge(int nums1[], int nums2[]) {
		int s1 = 3, s2 = nums2.length;
		int i = s1 - 1, j = s2 - 1, k = s1 + s2 -1;
		

		while (j >= 0) {

			if (i >= 0 && nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				i--;
			} else {
				nums1[k] = nums2[j];
				j--;
			}
			k--;
		}

	}

}
