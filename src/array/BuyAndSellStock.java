package array;
import java.util.ArrayList;

class Interval {
	int buy, sell;
}
public class BuyAndSellStock {

	public static void main(String[] args) {
		
		BuyAndSellStock stock = new BuyAndSellStock();
		
		int price[] = { 40, 32, 56, 156, 21, 3, 72, 84, 6 };
		int n = price.length;
		stock.stockBuySell(price, n);
		
		
		
		

	}

	void stockBuySell(int price[], int n) {
		int i = 0;
		int count = 0;
		ArrayList<Interval> al = new ArrayList<Interval>();

		if (n == 1)
			return;

		while (i < n - 1) {
			// find local minima
			// comparing present element to the next element
			while ((i < n - 1) && price[i + 1] <= price[i])
				i++;

			// if we reached end, break

			if (i == n - 1)
				break;

			Interval e = new Interval();
			e.buy = i++; // store index of minima

			// find local maxima
			// comparing to previous element

			while ((i < n) && price[i] >= price[i - 1])
				i++;

			// store index of maxima

			e.sell = i - 1;

			al.add(e);

			count++;

		}

		if (count == 0)
			System.out.println("There is no day when buying the stock will make profit");
		else
			for (int j = 0; j < count; j++)
				System.out.println("Buy on day: " + al.get(j).buy + " Sell on day: " + al.get(j).sell);

		return;

	}

}
