package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,5,8,9,10,15,15,18,19};
		int target = 17;
		
		checkTarget(arr,target);
		
	}
	
	public static void checkTarget(int []arr, int target) {
		Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		int i=0;
		int j=arr.length-1;
		
		while(i<j) {
			int sum =arr[i]+arr[j];
			if(sum==target)
				System.out.println(arr[i] + " " + arr[j]);
			if(sum<=target)
				i++;
			if(sum>=target)
				j--;
		}
	}
}
