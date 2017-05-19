package LeetCode;

public class Range_Sum_Query_303 {
	public static void main(String[] args){
		int[] nums = {-3,2,5,-1,3,2,1};
		NumArray array = new NumArray(nums);
		int sum = array.sumRange(3, 6);
		System.out.println(sum);
	}
}

class NumArray {
    int[] nums;

    public NumArray(int[] nums) {
        for(int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];
        
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        if(i == 0)
            return nums[j];
        
        return nums[j] - nums[i - 1];
    }
}
