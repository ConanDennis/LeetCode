package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindModeInBST_501 {
	
	Integer prev = null;   //记录父结点的值，而根结点上面是没有值的，所以只能用Integer来记录空值，同时当它有值时，它也能直接与int类型的val值比较
    int count = 1;
    int max = 1;
    
    //思路：和统计链表中出现的最多的值是一样的，只不过二叉树要递归遍历左右子结点。设一个计数count，一个记录最长值max，
    //当count>max时，就把list清空后，把当前值添加到list中；当count=max时，说明可能有一样多的其他值，把它也添加到list中即可。当每次递归结束之前，一定要把当前值赋给prev
    public int[] findMode(TreeNode root) {
        if (root == null) return new int[0];
        
        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) 
        	res[i] = list.get(i);
        return res;
    }
    
    private void traverse(TreeNode root, List<Integer> list) {
        if (root == null) return;
        traverse(root.left, list);
        
        if (prev != null) {
            if (root.val == prev)
                count++;
            else
                count = 1;
        }
        if (count > max) {
            max = count;
            list.clear();
            list.add(root.val);
        } else if (count == max) {
            list.add(root.val);
        }
        prev = root.val;
        
        traverse(root.right, list);
    }
}
