package array;

public class SmallestPositiveNumber {

	public static void main(String[] args) {

		int[] arr = { 4,5,2,1 }; // output: 3

		System.out.println(smallestPositiveNumber(arr));

	}

	public static int smallestPositiveNumber(int []arr) {
		int num=0;
		
		for(int i=0;i<arr.length;i++) {
			int n = arr[i]-1;
			if(n>=0 && n<arr.length)
				arr[n]*=-1;
		}
		
		for(int i: arr)
			System.out.println(i);
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				num=i+1;	
			break;
			}		
		}
		
		if(num==0)
			return arr.length+1;
		return num;
	}
	
}
