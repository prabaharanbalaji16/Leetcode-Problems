/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    boolean flag;
    public boolean isSymmetric(TreeNode root) {
        flag = true;
        helper(root.left,root.right);
        return flag;
    }
    void helper(TreeNode root1,TreeNode root2)
    {
        if(root1==null && root2==null)
        {
            return;
        }
        if(root1==null || root2==null || root1.val!=root2.val)
        {
            flag= false;
            return;
        }
        helper(root1.left,root2.right);
        helper(root1.right,root2.left);
    }
}

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
}
