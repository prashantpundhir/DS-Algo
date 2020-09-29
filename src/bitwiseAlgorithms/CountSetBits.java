package bitwiseAlgorithms;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 222;
		
		System.out.println(countSetBits(num));

	}

	public static int countSetBits(int n) {
		int count =0;
		
		while(n>0) {
			
			n= n & (n-1);
			count++;
		}
		
		
		return count;
		
	}
}
