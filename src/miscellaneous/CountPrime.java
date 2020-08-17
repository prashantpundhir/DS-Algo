package miscellaneous;

public class CountPrime {

	public static void main(String[] args) {

		System.out.println(countPrime(3));

	}

	public static int countPrime(int n) {

		boolean[] arr = new boolean[n];

		for (int i = 2; i * i < arr.length; i++) {
			if (!arr[i]) {
				for (int j = i; j * i < arr.length; j++)
					arr[i * j] = true;

			}
		}

		int count = 0;

		for (int i = 2; i < arr.length; i++) {
			if (!arr[i])
				count++;

		}

		return count;
	}

}
