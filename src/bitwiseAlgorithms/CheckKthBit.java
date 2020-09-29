package bitwiseAlgorithms;

public class CheckKthBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int k = 1;
		System.out.println(isKthBitSet(n, k));

	}

	public static boolean isKthBitSet(int n, int k) {

		if ((n & (1 << (k - 1))) != 0)
			return true;
		else
			return false;

	}

}
