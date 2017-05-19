package LeetCode;

public class BestTimeToSellII_122 {
	public static void main(String[] args){
		int[] a = {6,1,3,2,4,7};
		System.out.print(maxProfit(a));
		
	}
	
	//思路：这题与上一题最不一样的地方是，上一题求最大的单段获利，只需要一段上升区间的谷值，然后最后到峰值时直接减去谷值就行了
	//而这题如果这样求的话，虽然也能一次得出一段的最大获利，但是下一次的买入点就不好确认了，比如6，1，3，2，min=1，到3最大，按理说2应该是新买入点，profit要归零，
	//但因为判定条件是当前元素与min比，而这时2比min是要大的，因此profit会有值，但很显然是不正确的。
	//所以这题要采用“一天一结”，也就是当天获的利当天就加到总额上去，这样就能保证min总是挨着当前元素，当该元素小于min时候，就说明min已经是上升峰值，当前元素应是买入点，profit归零，而前段的获利已经加到总额上去了。
	public static int maxProfit(int[] prices) {
        if(prices.length==0 || prices==null)
            return 0;
        int min = prices[0];
        int profit = 0;     //小段获利
        int total = 0;      //总获利
        for(int i=1; i<prices.length; i++){
        	if(prices[i]<min){
                profit = 0;
                min = prices[i];
            }
            else if(prices[i] > min){
                profit = prices[i] - min;   
                total += profit;      //当天获的利，当前加到总额上
                profit = 0;
                min = prices[i];
            }
                
        }
        //total += profit;
        return total;
    }
}
