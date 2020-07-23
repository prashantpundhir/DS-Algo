package miscellaneous;

import java.util.HashMap;
import java.util.Map;
public class CountTriplets {

	public static void main(String[] args) {

		long arr[] = { 1, 3, 9, 9, 27, 81 };
		int r = 3;

		System.out.println(countTriplets(arr, r));

	}

	public static long countTriplets(long[] arr, int r) {
		long count = 0;
		Map<Long, Long> rightMap = new HashMap<>();
		Map<Long, Long> LeftMap = new HashMap<>();

		for (Long i : arr)
			rightMap.put(i, rightMap.getOrDefault(i, 0L) + 1L);

		for (long i : arr) {
			long leftCount = 0;
			long rightCount = 0;
			long lhs = 0;
			long rhs = i * r;
			if (i % r == 0) {
				lhs = i / r;
			}

			rightMap.put(i, rightMap.get(i) - 1L);

			if (rightMap.containsKey(rhs))
				rightCount = rightMap.get(rhs);
			if (LeftMap.containsKey(lhs))
				leftCount = LeftMap.get(lhs);

			count += leftCount * rightCount;
			LeftMap.put(i, LeftMap.getOrDefault(i, 0L) + 1L);
		}

		return count;
	}

}
