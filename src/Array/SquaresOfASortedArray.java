package Array;

public class SquaresOfASortedArray {

	public static void main(String[] args) {

		int []arr= {-3,-1,0,4,6,7,8,10};
		
		printSortedSquares(arr);
		
	}
	
	public static void printSortedSquares(int arr[]) {
		
		
		int n = arr.length;
		int j=0;
		Integer []a= new Integer[n];
		
		while(j<n && arr[j]<0)
			j++;
		
		int i=j-1;
		int t=0;
		
		while(i>=0 && j<n) {
			if(arr[i]*arr[i]<arr[j]*arr[j]) {
				a[t++]=arr[i]*arr[i];
			i--;	
			}
			else
			{
				a[t++]=arr[j]*arr[j];
				j++;
			}
		}
		
		while(i>=0) {
			a[t++]=arr[i]*arr[i];
			i--;
		}
		
		while(j<n) {
			a[t++]=arr[j]*arr[j];
			j++;
		}
		
		for(int num:a)
		System.out.print(num + " ");
	}

}
