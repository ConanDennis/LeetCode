package LeetCode;

import LeetCode.MinAbsoluteDifferenceInBST_530.TreeNode;

public class DiameterOfBT_543 {
	int maxPathLen = 0;
    
	
	//思路：此题其实是二叉树最大深度的变题。唯一多的只是构造了一个maxPathLen变量，用于随时计算当前的最大路径长度，maxPathLen很显然等于两棵子树的深度之和。
    public int diameterOfBinaryTree(TreeNode root) {
        
        maxDepth(root);
        return maxPathLen;
    }
    
    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        maxPathLen = Math.max(maxPathLen, left + right);
        
        return Math.max(left, right) + 1;
    }
}
