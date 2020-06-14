package Array;

import java.util.Arrays;

public class HeightChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,1,3,2,1,5,4};
		
		System.out.println(heightCheck(arr));

	}

	
	public static int heightCheck(int [] arr) {
		int h=0;
		
		int n= arr.length;
		int [] a= new int[n];
		
		
		for(int i=0;i<n;i++)
			a[i]=arr[i];
		
		Arrays.sort(a);
		for(int i=0;i<n;i++)
			if(a[i]!=arr[i])
				h++;
		
		
		return h;
	}
}
