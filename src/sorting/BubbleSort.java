package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {4,3,21,3,54,5,3,67,-1,-6,10};
		
		bubbleSort(arr);
		
	}
	static void bubbleSort(int []arr) {
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j+1]<arr[j]) {
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	
		for(int i=0; i<n;i++)
			System.out.print(arr[i] + " ");
		
	}

}
