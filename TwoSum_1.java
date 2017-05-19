package LeetCode;

public class TwoSum_1 {
	public static void main(String[] args){
	        int[] nums = {2, 7, 11, 15};
	        int target = 18;
	        
	        int[] index = twoSum(nums , target);
	        
	        for(int i = 0; i < index.length; i++)
	            System.out.print(index[i] + " ");
	    }
	    
    public static int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        
        Loop:for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                
                if(nums[i] + nums[j] == target){
                    index[0] = i;
                    index[1] = j;
                    break Loop;        //直接跳出两层循环
                }
            }
              
        }
        
        return index;
            
    }
}
