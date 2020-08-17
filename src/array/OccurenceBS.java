package array;

public class OccurenceBS {

	public static void main(String[] args) {

		int[] ar = { 0, 1, 2, 2, 2, 2, 3, 4, 5, 8, 8, 8, 9, 9, 10 };
		int num1 = 10;
		int num2 = 16;

		System.out.println(firstOccurence(ar, num1));
		System.out.println(lastOccurence(ar, num2));

	}

	public static int firstOccurence(int[] ar, int n) {
		int index = 0;
		
		int l= 0;
		int u=ar.length-1;
		
		while(l<=u) {
			int mid = l+(u-l)/2;
			if(mid==0|| ar[mid]==n && n>ar[mid-1] ) 
					return mid;
			else if(ar[mid]<n)
					l=mid+1;
			else
				u=mid-1;
		}
		return -1;
	}

	public static int lastOccurence(int[] ar, int n) {
		int index = 0;
		
		int l= 0;
		int u=ar.length-1;
		
		while(l<=u) {
			int mid = l+(u-l)/2;
			if(mid==u|| ar[mid]==n && n<ar[mid+1] ) 
					return mid;
			else if(ar[mid]>n)
					u=mid-1;
			else
				l=mid+1;
		}

		return -1;
	}

}
