package Array;

public class RemoveElementFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {0,0,1,2,3,3,3,4,4,4,5,5,6,8,9,9,9,9};
		
		System.out.println(remDuplicate(arr));
		

	}
	
	public static int remDuplicate(int [] arr) {
		int n=arr.length;
		int i=0;
		
		for(int j =1; j<n;j++) {
			if(arr[j]!=arr[i]) {
				i++;
				arr[i]=arr[j];
			}
			
			
		}
			
			
		
		for(int j=0;j<n;j++) {
			System.out.print(arr[j]);
		}
		
		
		
		return i+1;
	}
	

}
