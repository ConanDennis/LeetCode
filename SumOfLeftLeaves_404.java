package LeetCode;

public class SumOfLeftLeaves_404 {
	
	//思路：一个结点只可能有一个左叶子，所以当遍历到有左叶子的结点时，可以直接返回结点的左叶子的值，但是结点的右孩子情况不确定，需要继续遍历
	//没有左叶子发现时，结点的左右孩子情况都是不确定的，两边都要遍历
	public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || (root.left==null && root.right==null) )
            return 0;
        if(root.left!=null && root.left.left==null && root.left.right==null)
            return root.left.val + sumOfLeftLeaves(root.right);
        
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        
    }
}
