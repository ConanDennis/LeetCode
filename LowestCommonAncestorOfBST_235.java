package LeetCode;

public class LowestCommonAncestorOfBST_235 {
	
	//思路：找两个结点的最近公共结点（本身也可以为自己的祖先）。因为是二叉搜索树，因此找公共祖先应先考虑在不在同一子树上
	//如果在同一子树的话，再去那边往下继续找；如果不在同一子树，那它们最近的公共祖先只能是当前结点
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        }
    }
}
