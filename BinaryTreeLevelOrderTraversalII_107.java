package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII_107 {
	
	//思路：此题采用广度优先搜索（BFS），将同一层上的结点全部入队列后，然后在该长度的队列下逐一导出到list中，
	//导出该层的结点的同时，将下一层的结点入队列。然后在下一次循环中再逐一导出，每次循环的判定条件就是队列是否为空
	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root==null) return result;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(q.size()>0){
            List<Integer> levelList = new ArrayList<>();
            int levelSize  = q.size();
            for(int i=0; i<levelSize ; i++){     //这里一定要注意，len不能写为q.size()，因为循环体内q是有添加元素的，而这里每次只需要将当前层的结点全部导出就行了，所以要提前用len记录队列的长度
                TreeNode t = q.poll();
                levelList.add(t.val);
                if(t.left != null)  q.offer(t.left);
                if(t.right != null) q.offer(t.right);
            }
            result.add(0,levelList);
            
        }
        return result;
    }
}
