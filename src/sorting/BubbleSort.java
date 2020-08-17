package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		//to optimize the solution we can iterate 2nd loop till n-1-i and
		//to more optimization we can check if doesn't enter inside if condition 
		//it means array has been sorted and we don't need further itrations
		
		int arr[] = {4,3,21,3,54,5,3,67,-1,-6,10};
		
		bubbleSort(arr);
		
	}
	static void bubbleSort(int []arr) {
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			Boolean sorted = true;
			for(int j=0;j<n-1-i;j++) {
				if(arr[j+1]<arr[j]) {
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					sorted =false;
				}
			}
			if(sorted) break;
		}
	
		for(int i=0; i<n;i++)
			System.out.print(arr[i] + " ");
		
	}

}
