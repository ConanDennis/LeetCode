package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks_506 {
	public static void main(String[] args){
		int[] nums = {2,4,5,1,3,7,6};
		String[] ss = findRelativeRanks(nums);
		for(String s:ss){
			System.out.print(s+" ");
		}
	}
	
	//思路：先记录每个元素原来的下标，用Map即可，然后对数组进行排序后，可知道每个元素的名次，然后再通过找到原来的下标依次填入名次即可
	public static String[] findRelativeRanks(int[] nums) {
        if(nums == null || nums.length == 0) 
            return new String[0];
        int n = nums.length;
        String[] result = new String[n];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<n; i++){
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        
        result[map.get(nums[n-1])] = "Gold Medal";
        if(n>1) 
            result[map.get(nums[n-2])] = "Silver Medal";
        if(n>2) 
            result[map.get(nums[n-3])] = "Bronze Medal";
        for(int j=n-4; j>=0; j--){
            result[map.get(nums[j])] = String.valueOf(n-j);
        }
        return result;
    }
}
