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
		
        int x=20;
        String sup = (x < 15) ? "small" : (x < 22)? "tiny" : "huge";
        System.out.println(sup);
		
//		Boolean b1 = new Boolean("TRUE");
//        Boolean b2 = new Boolean("true");
//        Boolean b3 = new Boolean("tRuE");
//        Boolean b4 = new Boolean("false");
//
//        if (b1 == b2)result = 1;
//        if (b1.equals(b2))result = result + 10;
//        if (b2 == b4)result = result + 100;
//        if (b2.equals(b4))result = result + 1000;
//        if (b2.equals(b3))result = result + 10000;
//        System.out.println(result);
		
//        int x = 0x80000000;
//		System.out.print(x + " and ");
//		x = x >>> 31;
//		System.out.println(x);
//       
        double a = 354.03;
        int  b = 256;
        byte c = (byte) a;
        byte d = (byte) b;
        System.out.println(c + "\t"  + d);
        
        List<String>  list = new ArrayList<String>(); 
        list.add("DoSelect"); 
        list.add("InMobi"); 
        list.add("CampusHash"); 
        list.add("mKhoj");
        list.add("Microsoft");
        
        
//        String str="FiRstpROgrAm";;
//		String s=str;
//		int a=31,b=a++;
//		if (s=="FiRstproRAm")
//		    System.out.println(b--);
//	    else
//	        System.out.println(--b);
//	
   
        System.out.println("Original: " + list); 
   
        Collections.rotate(list, -2); 
   
        System.out.println("Rotated: " + list); 

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
