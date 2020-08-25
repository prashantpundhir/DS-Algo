package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		//Optimized version of Bubble Sort
		
		int arr[]= {3,2,1,4,67,343,2,3,434,-23,-3};
		
		selectionSort(arr);
		
	}
	static void selectionSort(int []arr) {
		int n =arr.length;
		
		for(int i=0;i<n-1;i++) {
			int minInd =i;
			for(int j =i+1; j<n; j++) {
				
				if(arr[j]<arr[minInd])
					minInd=j;
		
			}
			int temp= arr[i];
			arr[i]= arr[minInd];
			arr[minInd]= temp;
		}
		
		for(int a:arr)
			System.out.print(a + " ");
		
	}

}
