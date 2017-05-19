package LeetCode;

import java.util.Arrays;

public class MajorityElement_169 {
	public static void main(String[] args){
		int[] nums = {2,3,2,3,5,3,3,3};
		int n =majorityElement(nums);
		if(n == -1)
			System.out.println("No dominator");
		else
			System.out.println(n);
	}
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max = 1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                max ++;
                
                if((double)max/nums.length > 0.5){
                    return nums[i];
                }
                
            }else{
                max = 1;
            }
            
               
            
        }
        
        return -1;
    }
}
