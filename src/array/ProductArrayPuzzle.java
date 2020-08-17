package array;

public class ProductArrayPuzzle {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		System.out.println("Product array is : ");

		productArray(arr);
		pa(arr);

	}

	public static void productArray(int[] arr) {

		int n = arr.length;
		int []product = new int[n];
		
		if(n==1) {
			System.out.println(arr[0]);
		return;
			
		}
			
		int temp = 1;
		
		for(int i=0;i<n;i++) {
			product[i] = temp;
			temp = temp*arr[i];
		}
		
		for(int i:product)
			System.out.print(i+ " ");
		
		temp=1;
		for(int i=n-1;i>=0;i--) {
			product[i]*=temp;
			temp= temp*arr[i];
		}
		System.out.println();
		for(int i:product)
			System.out.print(i+ " ");
		
		
	}
	
	public static void pa(int arr[]) {
		
		int n=arr.length;
		if(n==1) {
			System.out.println(arr[0]);
			return;
		}
			
		int left[] = new int[n];
		int right[] = new int[n];
		
		int product[] = new int[n];
		
		int temp = 1;
		left[0] = 1;
		right[n-1] = 1;
		
		System.out.println();
		for(int i = 1;i<n;i++) {
			
			left[i] = left[i-1]* arr[i-1];
		System.out.print(left[i]+ " ");
		}
		
		System.out.println();
		for(int i =n-2; i>=0; i--) {
			right[i]= right[i+1]*arr[i+1];
			System.out.print(right[i]+ " ");
		}
		
		for(int i=0;i<n;i++)
			product[i]=left[i] * right[i];
		System.out.println();
		for(int i:product)
			System.out.println(i);
		
		
		
	}

}
