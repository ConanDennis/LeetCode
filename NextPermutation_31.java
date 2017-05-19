package LeetCode;

import java.util.Arrays;

public class NextPermutation_31 {
	public static void main(String[] args){
		int[] nums = {1,3,2};
		int[] res = nextPermutation(nums);
		for(int e : res) {
			System.out.print(e + " ");
		}
	}
	
	//思路：实际上就是局部小范围的元素交换
	//最简单的情况，如果最后俩元素是升序，相当于最后一位是降序，那么下一个排列就是最后俩元素交换
	//再复杂一点的情况，最后两位是降序，倒数第三位元素都小于后两位，那么接下来一个排列就是将最后一位与倒数第三位交换，然后将后两位恢复自然顺序。
	//更一般的情况，最后N位是降序，倒数第N+1位元素都小于后N位，那么接下来的排列就是找出后N位中最小的那个数，与倒数第N+1位交换，然后将后N位恢复自然顺序。
	public static int[] nextPermutation(int[] nums) {
		int len = nums.length;
        if(len < 2) return nums;
        
        int point = len - 1;
        while(nums[point] <= nums[point-1]) {
            point -- ;     //point指向降序开始的位置
            
            //一定要注意数组下标越界的问题，当point等于0,说明整个数组是降序，那么直接将整个数组恢复自然顺序就好了
            if(point == 0) {    
            	Arrays.sort(nums) ;
                return nums;
            }
        
        }
        
        int exchange = Integer.MAX_VALUE , exchange_index = -1;
        for(int i=len-1; i>=point; i--){
            if(nums[i]>nums[point-1] && nums[i]<exchange) {
                exchange = nums[i];
                exchange_index = i;
            }
        }
        
        int t = nums[point-1];
        nums[point-1] = nums[exchange_index];
        nums[exchange_index] = t;
        
        Arrays.sort(nums, point, len); //将数组从point到len-1恢复自然顺序
        
        return nums;
    }
}
