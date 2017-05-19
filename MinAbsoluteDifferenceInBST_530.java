package LeetCode;

import java.util.ArrayList;
import java.util.List;


public class MinAbsoluteDifferenceInBST_530 {
	
	static class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
		 
	public static void main(String[] args){
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(3);
		TreeNode c = new TreeNode(2);
		a.left = null;
		a.right = b;
		b.left = c;
		b.right = null;
		c.left = null;
		c.right = null;
		System.out.println(getMinimumDifference(a));
				
	}
	
	//思路：二叉搜索树中序遍历后得到的是排好序的串，要求两个结点值之差的最小值，只需要比较相邻之间差的最小值即可
	public static int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root , list);
        
        int min = Integer.MAX_VALUE;
        for(int i=1 ; i<list.size(); i++){
            min = Math.min(list.get(i)-list.get(i-1) , min);
        }
        return min;
    }
    
    public static void inOrder(TreeNode root, List<Integer> list){
        
        if(root.left==null && root.right==null){
            list.add(root.val);
            return;
        }
        if(root.left != null) inOrder(root.left , list);
        list.add(root.val);
        if(root.right != null) inOrder(root.right , list);
        
    }
}


