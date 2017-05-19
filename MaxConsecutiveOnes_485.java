package LeetCode;

public class MaxConsecutiveOnes_485 {
	public static void main(String[] args){
		int[] num = {0,1,0,0,1,1,1,0,1,1};	
		System.out.println(findMaxConsecutiveOnes(num));
	}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0 , temp = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=1){
                temp = 0;
                continue;
            }else{
                temp ++;
                if(temp > maxLen)
                    maxLen = temp;
            }
            
        }
        return maxLen;
    }
}
