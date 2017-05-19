package LeetCode;

public class SameTree_100 {
	
	//思路：只有当当前结点相等的时候，才有可能往下比。而当前结点相等有两种情况，一种是两个都为null，说明从这个结点往上的所有结点都是相等的；
	//一种是两个都有值，但下面情况还不确定，需要继续往下遍历。在同样位置一个结点有值，另一个为null时，可直接判定false
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) 
            return true;
        if(p == null || q == null) 
            return false;
        if(p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return false;
        
    }
}
