package array;

import java.util.Arrays;

public class cupCakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int calorie[] = { 1, 3, 2 };

		long min = marcsCakewalk(calorie);
		System.out.println(min);

	}

	static long marcsCakewalk(int[] calorie) {

		Arrays.sort(calorie);

		int len = calorie.length;
		for (int j = 0; j < len / 2; j++) {
			int temp = calorie[j];
			calorie[j] = calorie[len - j - 1];
			calorie[len - j - 1] = temp;
		}

		int i=0;
		long s = 0;
		for (i = 0; i < len; i++)
			s += calorie[i] * Math.pow(2, i);

		return s;
	}

}
