package LeetCode;

public class MoveZeroes_283 {
	public static void main(String[] args){
        int[] nums = {0 , 0, 1, 0 , 3 , 12};
        moveZeroes(nums);
        for(int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }
    
    public static void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++)
           
        	if(nums[i] == 0){              //注意，必须考虑连续出现0的情况
                int count = 1;
                
            	for(int k = i+1 ; k < nums.length; k++){           //此循环用于统计连续出现0的个数
            		if(nums[k] == 0)
            			count ++;
            		else 
            			break;
            	}
            	
            	for(int j = i; j < nums.length-count; j++)        //此循环用于将指标右边第一个非零元素以其后面的元素挪到指标处来
                    nums[j] = nums[j+count];
            
                for(int l = nums.length-1; l >= nums.length-count; l--)          //此循环用于将0放到数组后边去，连续出现几个0，就在后面放几个
                	nums[l] = 0;
            }
        
    }
}
