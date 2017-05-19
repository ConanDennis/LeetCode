package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThirdMaximumNumber_414 {
	
	//思路：此题很显然将数组排序并剔除重复元素就可以了，但是用TreeSet之后取元素时不方便，所以用Arrays.sort()和List两步实现存储
	public int thirdMax(int[] nums) {
        int len = nums.length;
        if(len == 1) return nums[0];
        if(len == 2) return Math.max(nums[0] , nums[1]);
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        list.add(nums[len-1]);
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i] != nums[i+1]){
                list.add(nums[i]);
            }
        }
        
        if(list.size() < 3) return list.get(0);
        
        return list.get(2);
       
    }
}
