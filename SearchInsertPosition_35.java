package LeetCode;

public class SearchInsertPosition_35 {
	
	//思路：很容易想到折半查找，如果中间找到了，直接返回索引。如果没有找到，最后只有可能在mid值的左右。
	//如果在mid左边，那么mid的位置就是target要插入的位置；如果在右边，就是mid+1
	public int searchInsert(int[] nums, int target) {
        int low = 0 , high = nums.length-1;
        int mid = 0;
        while(low<=high){
            mid = (low+high)/2;
            if(target<nums[mid]){
                high = mid-1;
            } else if(target>nums[mid]){
                low = mid+1;
            } else{
                return mid;
            }
        }
        if(target>nums[mid])
            return mid+1;
        else
            return mid;
    }
}
