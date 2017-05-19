package LeetCode;

public class MinDepthOfBinaryTree_111 {
	public static void main(String[] args){
		
	}
	
	//思路：和找最大深度差不多，但有一点不一样，就是当一个结点上只有一个孩子时，如果用min直接取两遍的最小值时，会返回0，而这是不符合题意的，显然最近的叶子在有孩子的那一边
	public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        
        int dep = 0 ;
        if(root.left!=null && root.right==null)
            dep = minDepth(root.left);
        else if (root.left==null && root.right!=null)
            dep = minDepth(root.right);
        else if(root.left!=null && root.right!=null)
            dep = Math.min(minDepth(root.left),minDepth(root.right));
        
        return 1+dep;
    }
}
