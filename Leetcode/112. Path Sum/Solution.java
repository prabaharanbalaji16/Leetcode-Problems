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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return sum(root,targetSum,0);
    }
    boolean sum(TreeNode root,int target,int current)
    {
        if(root==null)
            return false;
        if(root.left==null && root.right==null)
        {
            current+=root.val ;
            if(current == target)
                return true;
        }
       
        return sum(root.left,target,current+root.val) || sum(root.right,target,current+root.val);
    }
}