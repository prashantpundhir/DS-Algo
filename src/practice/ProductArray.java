package practice;

public class ProductArray {

	/*
	 * This problem was asked by Uber.
		Given an array of integers, return a new array such that each element at index i 
		of the new array is the product of all the numbers in the original array except 
		the one at i.
		For example, if our input was [1, 2, 3, 4, 5], the expected output would be
	 	[120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
	 */
	
	
	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 4, 5};  // output: [120, 60, 40, 30, 24]
		
		printProductArray(arr);
		
	}

	public static void printProductArray(int []arr) {
		
		int n= arr.length;
		int temp=1;
		int product[]= new int[n];

		for(int i=0;i<n;i++) {
			product[i]= temp;
			temp=temp*arr[i];
		}
		temp=1;
		
		for(int i=n-1;i>=0;i--) {
			product[i]*= temp;
			temp=temp*arr[i];
		}
		
		for(int num:product)
			System.out.print(num + " ");
		
	}
	
}
