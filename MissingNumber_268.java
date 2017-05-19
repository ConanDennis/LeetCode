package LeetCode;

//import java.util.Arrays;

public class MissingNumber_268 {
	public static void main(String[] args){
		int[] nums = new int[]{0,1,2,4,5,6,7,8};
		System.out.println(missingNumber(nums));
	}
	
	//思路1：缺少的那个数，用完整的数组之和减去有缺陷的数组之和，就能得到了。
	//思路2：将缺陷的数组排序后，如果元素跟索引不一致，就能得到那个数了。此方法需要排序
	public static int missingNumber(int[] nums) {
		
        int sum = 0;
        for(int num: nums)
            sum += num;
            
        return nums.length * (nums.length+1) / 2 - sum;
	    
		/* Arrays.sort(nums);
        int i;
        for(i=0; i<nums.length; i++){
            if(nums[i] != i)
                break;
        }
        return i;*/
    }
}
