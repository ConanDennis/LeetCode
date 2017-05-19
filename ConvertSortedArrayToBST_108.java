package LeetCode;

import java.util.Arrays;

public class ConvertSortedArrayToBST_108 {
	
	//思路：找数组中间的那个数为根节点，比它小的数全部在左子树，比它大的数都在右子树，继续在子数组中递归，不断得找子数组的中间那个数
	//当mid等于数组下限时，说明左子树上的孩子已经全部找完，当mid等于上限时，说明右子树上的孩子已经全部找完。
	public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null || nums.length==0)
            return null;
        if(nums.length==1)  return new TreeNode(nums[0]);
        
        int low = 0 , high = nums.length-1;
        int mid = (low+high)/2;
        TreeNode p = new TreeNode(nums[mid]);
        
        if(mid>low){
            int[] lnums = Arrays.copyOfRange(nums, low, mid);   //把从low到mid-1的元素复制到新数组中
            p.left = sortedArrayToBST(lnums);
        }else{
            p.left = null;
        }
        
        if(mid<high){
            int[] rnums = Arrays.copyOfRange(nums, mid+1, high+1);  //把从mid+1到high的元素复制到新数组中
            p.right = sortedArrayToBST(rnums);
        }else{
            p.right = null;
        }
        
        return p;
    }
}
