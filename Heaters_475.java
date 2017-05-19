package LeetCode;

import java.util.TreeSet;

public class Heaters_475 {
	public static void main(String[] args){
		int[] houses = new int[]{1, 2, 3, 4, 5};
		int[] heaters = new int[]{1, 4};
		System.out.println(findRadius(houses, heaters));
	}
	
	//思路：几个加热器放在不同位置的房子处，每个加热器有相同的覆盖范围。已知房子位置和加热器位置，求加热器的最小覆盖半径，可以让所有房子取暖。
	//由此将此问题简化为求每个房子与最近加热器的最小距离，要满足所有的房子，那么结果就是这么多个最小距离的最大值。
	public static int findRadius(int[] houses, int[] heaters){
		TreeSet<Integer> set = new TreeSet<>();
		for(int hearter : heaters){
			set.add(hearter);
		}
		
		int dist=Integer.MAX_VALUE , res=0;
		int dist_low=0 , dist_high=0;
		for(int house : houses){
			if(set.ceiling(house) != null)
				dist_low = set.ceiling(house) - house;
			else
				dist_low = Integer.MAX_VALUE;
			
			if(set.floor(dist_high) != null)
				dist_high = house - set.floor(house);
			else
				dist_high = Integer.MAX_VALUE;
			
			dist = Math.min(dist_low, dist_high);
			res = Math.max(dist, res);
		}
		
		return res; 
	}
}
