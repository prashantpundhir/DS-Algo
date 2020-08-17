package miscellaneous;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		// If you were only permitted to complete 
		//at most one transaction (i.e., buy one and 
		//sell one share of the stock), design an algorithm
		//to find the maximum profit.
		
		int []prices = {7,1,5,3,6,4};
		
		System.out.println(maxProfit(prices));
		
	}
	
	public static int maxProfit(int [] prices) {
		int maxProfit =0;
		
		int minPrice = prices[0];
		
		for(int i=0;i<prices.length;i++) {
			
			if(minPrice>prices[i])
				minPrice = prices[i];
			else if(prices[i]-minPrice > maxProfit) {
				maxProfit =prices[i]-minPrice;
			}
			
		}
		
		
		
		return maxProfit;
	}

}
