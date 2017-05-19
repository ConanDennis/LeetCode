package LeetCode;

public class MinMovesToEqualArray_453 {
	public static void main(String[] args){
		int[] nums = {1,2,3,5};
		System.out.println(minMoves(nums));
	}
	public static int minMoves(int[] nums) {
        if(nums.length == 0) 
            return 0;
        int min = nums[0], sum = 0;
    	for (int n : nums) {
    	    min = Math.min(min, n); 
    	    sum += n;
    	}
    	return sum - nums.length * min;       //多写几个总结出的规律，sum(array) - n * min(array)  
    }
}
