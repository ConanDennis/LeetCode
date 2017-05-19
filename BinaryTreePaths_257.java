package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths_257 {
	
	//只要没到叶子结点，就一直记录路径，到叶子结点的时候直接将 叶子结点的值添加到路径后
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root==null) return result;
        searchBT(root, "", result);
        return result;
        
    }
    
    public void searchBT(TreeNode p, String path, List<String> result){
        if(p.left==null && p.right==null) result.add(path+p.val);
        if(p.left!=null) searchBT(p.left, path+p.val+"->", result);
        if(p.right!=null) searchBT(p.right, path+p.val+"->", result);
    }
}
