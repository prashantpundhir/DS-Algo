package array;

public class MoveZeroToEnd {

	public static void main(String[] args) {

		int []arr= {1,0,2,5,4,0,0,3,5,4,7,0,5,8,19,58,5,2};
		
		moveZero(arr);
		
		for(int i:arr)
			System.out.print(i+",");
		
	}
	static void moveZero(int []arr) {
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0)
				arr[count++]=arr[i];
		}
		
		while(count<arr.length) {
			
			arr[count++]=0;
		}
		
	}

}
