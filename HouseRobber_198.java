package LeetCode;

public class HouseRobber_198 {
	public static void main(String[] args){
		int[] nums = {183,219,57,193,94,233,202,154,65,240,97,234,100,249,186,66,90,238,168,128,177,235,50,81,185,165,217,207,88,80,112,78,135,62,228,247,211};
		System.out.println(rob(nums));
	}
    public static int rob(int[] nums) {
    	if(nums == null || nums.length == 0){
            return 0;
        }
        
        int n0 = 0;  // 记录没有选择当前house时的获取的最大金额
        int n1 = 0;  // 记录选择当前house时的获取的最大金额
        for(int i = 0; i < nums.length; i++){
            int tmp = n0;
            n0 = Math.max(n0 , n1);  //没有选择当前house，那么它等于上次选择了或没选择的最大值  
            n1 = tmp + nums[i];  //选择了当前house，值只能等于上次没选择的+当前house中的money
        }
        
        return Math.max(n0 , n1);
    	
        /*自己想的递归解法，但是用时太多
    	int max = 0;
        int len = nums.length;
        if(len == 0)
            return 0;
        else if(len == 1)
            max = nums[0];
        else if(len == 2)
            max = nums[0] > nums[1] ? nums[0] : nums[1];
        else if(len == 3)
            max = nums[0] + nums[2] > nums[1] ? nums[0] + nums[2] : nums[1];
        else if(len == 4){
            int r1 = nums[0] + (nums[2] > nums[3] ? nums[2] : nums[3]);
            int r2 = nums[1] + nums[3];
            max = r1 > r2 ? r1 : r2;
        }
        else{
            int[] tmp1 = new int[len - 2];
            System.arraycopy(nums,2,tmp1,0,len-2);
            int[] tmp2 = new int[len - 3];
            System.arraycopy(nums,3,tmp2,0,len-3);
            int[] tmp3 = new int[len - 4];
            System.arraycopy(nums,4,tmp3,0,len-4);
            
            int r1 = nums[0] + (rob(tmp1) > rob(tmp2) ? rob(tmp1) : rob(tmp2));
            int r2 = nums[1] + (rob(tmp2) > rob(tmp3) ? rob(tmp2) : rob(tmp3));
            
            max = r1 > r2 ? r1 : r2;
            
        }
        
        return max;
        */
    }
	
}
