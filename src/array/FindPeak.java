package array;

public class FindPeak {

	
	// A binary search based function that returns index of a peak 
	// element 
	static int findPeakUtil(int arr[], int low, int high, int n) 
	{ 
		// Find index of middle element 
		int mid = low + (high - low)/2; /* (low + high)/2 */

		// Compare middle element with its neighbours (if neighbours 
		// exist) 
		if ((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || 
			arr[mid+1] <= arr[mid])) 
			return arr[mid]; 

		// If middle element is not peak and its left neighbor is 
		// greater than it,then left half must have a peak element 
		else if (mid > 0 && arr[mid-1] > arr[mid]) 
			return findPeakUtil(arr, low, (mid -1), n); 

		// If middle element is not peak and its right neighbor 
		// is greater than it, then right half must have a peak 
		// element 
		else return findPeakUtil(arr, (mid + 1), high, n); 
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {93,4,5,16,17,24,33,42,45,56};
		System.out.println(findPeakUtil(arr, 0, arr.length, arr.length));

	}
	
//	public static int findPeak(int[] arr) {
//		
//		int low=0;
//		int high = arr.length-1;
//		int mid=0;
//		while(low<=high) {
//			mid=(low+high)/2;
//			
//			if(mid==0 && arr[mid]>arr[mid+1])
//				return arr[mid];
//			else if(arr[mid]>arr[mid-1] && mid== arr.length-1)
//				return arr[mid];
//			else if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid])
//				return arr[mid];
//
//			
//			else if(arr[mid-1]>arr[mid])
//				high =mid-1;
//			else
//				low=mid+1;
//			
//		}
//		
//		
//		return 0;
//	}
	

}
