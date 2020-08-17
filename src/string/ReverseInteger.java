package string;

public class ReverseInteger {

	public static void main(String[] args) {

		int n = reverse(-58585123);

		System.out.println(n);

	}

	public static int reverse(int x) {

		Boolean neg = false;

		if (x < 0) {
			neg = true;
			x *= -1;

		}

		long rev = 0;

		while (x > 0) {

			rev = (rev * 10) + (x % 10);
			x /= 10;

		}

		if (rev > Integer.MAX_VALUE)
			return 0;

		return neg ? (int) (-1 * rev) : (int) (rev);
	}
}
