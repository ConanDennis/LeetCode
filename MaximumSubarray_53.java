package LeetCode;

public class MaximumSubarray_53 {
	public static void main(String[] args){
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	
	//思路：本题在于计算实时最大的和，然后实时将这个和值经过比较后记录到max中。此题单纯考虑负值是不可取的，因为如果负值的前面和后面的树之和都大于它的绝对值，那么仍然能使和增加
	//因此要将当前元素与之前的和值加上当前元素作比较，他们中较大的作为新的和值。
	public static int maxSubArray(int[] nums) {
        int max=nums[0], sum=nums[0];
        for (int i=1; i<nums.length; ++i){
        	sum = Math.max(sum+nums[i] , nums[i]);
        	max = Math.max(max , sum);	
        }
        return max;
    }
}