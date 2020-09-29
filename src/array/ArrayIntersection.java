package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArrayIntersection {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,2,1};
		int arr2[]= {2,2};
		int arr3[]= findIntersection(arr1, arr2);
		
		for(int i:arr3)
			System.out.println(i);
	
	}
	
	public static int[] findIntersection(int[]arr1, int [] arr2) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i: arr1)
			set.add(i);
		
		HashSet<Integer> iset =new HashSet<Integer>();
		for(int i:arr2)
			if(set.contains(i))
				iset.add(i);

	int []arr= new int[iset.size()];
 		int index=0;
		for(int i: iset)
		arr[index++]=i;	
		
		return arr;
		
		
	}

}
