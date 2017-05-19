package LeetCode;

public class BestTimeToSell_121 {
	public static void main(String[] args){
		int[] prices = {7, 3, 1, 4, 8, 2, 9, 2, 4, 3, 1 , 6, 5};
		System.out.println(maxProfit(prices));
		
	}
	
    public static int maxProfit(int[] prices) {
        int min = 0;
        int maxpro = 0 ;
        
        if(prices.length > 1)
            for(int i = 1; i < prices.length; i++){
                if(prices[i] < prices[min])
                    min = i;
                else
                    maxpro = Math.max(maxpro , prices[i] - prices[min]);
                
            }
        
        
        return maxpro;        
        
    }
}
