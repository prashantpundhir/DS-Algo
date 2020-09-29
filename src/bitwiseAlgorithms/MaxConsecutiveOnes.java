package bitwiseAlgorithms;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 38;

		System.out.println(maxOnes(n));

	}

	public static int maxOnes(int n) {

		int count = 0;

		while (n != 0) {

			n = n & (n << 1);
			System.out.println(n);
			count++;
		}

		return count;
	}

}
