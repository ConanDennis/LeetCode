package LeetCode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class PathSumⅢ_437 {
	/*这个题目有点复杂，需要理清头绪，因为从二叉树的中间任意一段之和等于sum都可以
	 * 所以无法使用将root逐级减掉的方法，而带上root和不带上root的情况都可能出现，逐个情况考虑肯定是行不通的
	 * 所以想到用整体法，无论树有多少层，涉及的叶子有多少，总之对于当前sum来说，需要考虑的只有以root为根及其左右子节点为根的满足条件数量
	 * 将整体再细分，这就需要构造辅助函数了，辅助函数能统计对于当前sum，以该结点为根的所有满足条件的情况数
	 * 也就是在辅助函数中，root与其子节点们都是有牵制关系的，假如sum=10，root的val为2，那么传进root.left的sum就应该是8，root.left.left的val是3，那么传进来的sum就成了5
	 * 而在整体函数中，root与左右子节点是独立的，sum=10，那么传进root及root.left的sum就都是10
	 * 所以本题需要两个递归，一个整体——能将root和root.left&right拆分成独立的三个二叉树，一个局部——能将以root为根的一个二叉树的所有枝叶遍历完*/
	public int pathSum(TreeNode root, int sum) {
        int count = findPathWithRoot(root, sum);
        if (root != null) 
        	count += pathSum(root.left, sum) + pathSum(root.right, sum); //add case when root is excluded.
        return count;
    }
    
    private int findPathWithRoot(TreeNode root, int sum) { //Must contain root.val when calculating sum.
        if (root == null) return 0;
        int count = 0;
        if (root.val == sum) 
        	count = 1;
        
        return count + findPathWithRoot(root.left, sum - root.val) + findPathWithRoot(root.right, sum - root.val);
    }
}
