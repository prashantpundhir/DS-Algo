package miscellaneous;

import java.util.ArrayList;
import java.util.List;

public class StockMaximize {

	public static void main(String[] args) {

		List<Integer> prices = new ArrayList<>();
		prices.add(1);
		prices.add(30);
		prices.add(20);
		prices.add(2);

		System.out.println(stockmax(prices));

	}

	public static long stockmax(List<Integer> prices) {
		long max = 0L;
		int size = prices.size();
		int currentMax = prices.get(size - 1);

		for (int i = size-1; i >= 0; i--) {
			if (prices.get(i) > currentMax)
				currentMax=prices.get(i);
			max += currentMax - prices.get(i);

		}

		return max;

	}

}
