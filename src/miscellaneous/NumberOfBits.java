package miscellaneous;

public class NumberOfBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		System.out.println(hammingWeight(n));

	}
	public static int hammingWeight(int n) {
		
		// 1st approach (Loop and Flip)
//	    int bits = 0;
//	    int mask = 1;
//	    for (int i = 0; i < 32; i++) {
//	        if ((n & mask) != 0) {
//	            bits++;
//	        }
//	        mask <<= 1;
//	    }
//	    return bits;
//	    
//	    2nd approach (Bit Manipulation Trick) 

	    int sum = 0;
	    while (n != 0) {
	        sum++;
	        n &= (n - 1);
	    }
	    return sum;    
	    
	}

}
