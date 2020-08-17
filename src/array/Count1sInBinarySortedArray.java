package array;

public class Count1sInBinarySortedArray {

	public static void main(String[] args) {
		int arr[] = {0,0,0,1,1,1,1,1,1};
		
		System.out.println(count1s(arr));
	}
	
	public static int count1s(int []arr) {
	
		int n =  arr.length-1;
		int l=arr.length;
		int i=0;
		
		while(i<=n) {
			int mid=(i+n)/2;
			if(arr[mid]==1 && (arr[mid-1]!=1 || mid==0 )) {
				return l-mid;
			}
			else if(arr[mid]==0)
				i=mid+1;
			else
				n=mid-1;
		}
		
		return 0;
	}

}
