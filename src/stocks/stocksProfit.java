/**
 * 
 */
package stocks;

import java.util.Arrays;

/**
 * @author fiona
 *
 */
public class stocksProfit {

	
	public int profit(int[]prices) {
		
		
		int n= prices.length;
		int min=0; //buy stock
		int max = 1; //sell stock
		//profit is max -min
		int maxprofit = 0, currentprofit=0;
		while (max < n) {
			if (prices[min]> prices[max]) {
				min=max;
				
			}
			else {
				currentprofit=prices[max]-prices[min];
				if (currentprofit>maxprofit) //can used maxProfit=Math.max(currentprofit, maxprofit)
					maxprofit=currentprofit;
			}
			max++;
			
			
		}
		
		return maxprofit;
		
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myprices= {7,6,4,3,1};
		stocksProfit maxprofit= new stocksProfit();
		int profit= maxprofit.profit(myprices);
		System.out.println("Profit of "+ Arrays.toString(myprices) +" is "+ profit);
		
		
		

	}

}
