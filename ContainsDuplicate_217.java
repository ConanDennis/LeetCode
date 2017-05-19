package LeetCode;

import java.util.Arrays;

public class ContainsDuplicate_217 {
    public static void main(String[] args){
        int[] nums = {2, 5, 6, 1, 3, 9, 5, 3, 4, 8};
        boolean b = new  ContainsDuplicate_217().containsDuplicate(nums);
        System.out.println(b);
    }
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length-1; i++)
            if(nums[i] == nums[i+1])
                return true;
        
        return false;
    }
}
