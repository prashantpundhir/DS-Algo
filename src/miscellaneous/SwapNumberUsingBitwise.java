package miscellaneous;

public class SwapNumberUsingBitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b=5;
		
		a^=b;  // 001 110   111
		b^=a;  // 110 111  001
		a^=b;  // 111 001  110
		
		System.out.println(a + " " + b);
 
	}

}
