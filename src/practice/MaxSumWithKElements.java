package practice;

public class MaxSumWithKElements {

	public static void main(String[] args) {
		int arr[] = {-32,-4,-15,-6,-7,-8,-2,-4,-5,-10,-19,-6};
		
	int k=3;
		
		System.out.println(maxSum(arr,k));
		
	}
	public static int maxSum(int []arr, int k) {
		
		int currSum=0;
		
		for(int i=0;i<k;i++) {
			currSum+=arr[i];
		}
		int maxSum= currSum;
		
	for(int i=k;i<arr.length;i++) {
		currSum+=arr[i]-arr[i-k];
		maxSum=Math.max(maxSum, currSum);
	}
		return maxSum;
	}

}
