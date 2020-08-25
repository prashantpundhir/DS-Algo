package array;

import java.util.HashSet;

public class TripletSum {

	public static void main(String[] args) {
		// 1. take 3 loops, n-2.n-1,n
		// 2. sort the array and then check sum for i+1,n,arr[i]
		// 3. use hashing

		int arr[]= {13,32,44,23,31,24,42,4,41};
		int k=40;
		System.out.println(findTriplet(arr,k));
		
	}
	
	static boolean findTriplet(int arr[], int k) {
		
		
		for(int i=0;i<arr.length-2;i++) {
			HashSet<Integer> hm =new HashSet<>();
			int currSum = k-arr[i];
			for(int j=i+1;j<arr.length-1;j++) {
				
				if(hm.contains(currSum-arr[j])) {
					System.out.println("Triplet: " + arr[i]+" " + currSum+ " " + arr[j]);
					return true;
				}
				hm.add(arr[j]);
			}
			
		}
		
	return false;	
	}

}
