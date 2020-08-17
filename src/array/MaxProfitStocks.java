package array;

public class MaxProfitStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] prices= {7,3,4,5,6,1,4,8,4,2,3};
		
System.out.println(findMaxProfit(prices));

	}
	
	public static int findMaxProfit(int []prices) {
		
		int maxProfit=0;
		
		int i=0;
		int n= prices.length;
		int peak,valley;
	while(i<n-1) {
		while(i<n-1 && prices[i]>=prices[i+1]) 
			i++;
		valley =prices[i];
		
		while(i<n-1&& prices[i]<=prices[i+1])
			i++;
		peak=prices[i];
		
		maxProfit += peak-valley;
	}
		
		return maxProfit;
	}

}
