package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicateII_219 {
	public static void main(String[] args){
		int[] nums = {1, 0, 2, 1, 1, 3};
		int k = 1;
		
		System.out.println(containsNearbyDuplicate(nums , k));
	}
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length < 2)
            return false;
        
        Set<Integer> set = new HashSet<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        int temp;
        
        for(int i = 0 ; i < nums.length; i ++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                map.put(nums[i] , i);
                
            }else{
                temp = i - map.get(nums[i]);
                if(temp > k)
                    map.put(nums[i],i);
                else
                    return true;
            }
        }
        
        return false;
    }
}
