package LeetCode;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class PathSum_112 {
	public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        
        if(root.left == null && root.right == null && root.val == sum)
            return true;
        
        boolean ans1=false , ans2=false; 
        if(!(root.left == null)){
            root.left.val += root.val;
            ans1 = hasPathSum(root.left,sum);
        }
        
        if(!(root.right == null)){
            root.right.val += root.val;
            ans2 = hasPathSum(root.right,sum);
        }
        
        return ans1||ans2;

    }
}
