package LeetCode;

public class InvertBinaryTree_226 {
	public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;
        if(root.left==null && root.right==null)
            return root;
        else if(root.left!=null && root.right!=null){
            TreeNode temp = invertTree(root.left);
            root.left = invertTree(root.right);
            root.right = temp;
        }
        else if(root.left!=null && root.right==null){
            root.right = invertTree(root.left);
            root.left = null;
        }
        else{
            root.left = invertTree(root.right);
            root.right = null;
        }
        return root;
    }
}
