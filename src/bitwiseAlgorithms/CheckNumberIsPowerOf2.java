package bitwiseAlgorithms;

public class CheckNumberIsPowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 64;

		System.out.println(isPowerOf2(n));

	}

	public static boolean isPowerOf2(int n) {

		if (n==0 || (n & (n - 1))==0)
			return true;
		else
			return false;

	}
}
