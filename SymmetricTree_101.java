package LeetCode;

public class SymmetricTree_101 {
	
	//思路：要满足对称的话，除了当前同层对称位置上的两个结点的值相等外，还要求其左子树等于另一个的右子树，其右子树等于另一个的左子树
	//下面都要满足这样的条件，因此构造一个判定对称的函数，用来递归。
	public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isMirror(root.left,root.right);
    }
    
    public boolean isMirror(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return (p.val==q.val) && isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }
}
