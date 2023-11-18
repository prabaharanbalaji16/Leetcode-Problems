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
    public int getMinimumDifference(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        int ans= Integer.MAX_VALUE,prev = -1;
        while(root!=null || !q.isEmpty())
        {
            while(root!=null)
            {
                q.push(root);
                root = root.left;
            }
            root = q.pop();
            if(prev >=0)
            {
                ans = Math.min(ans,root.val-prev);
            }
            prev = root.val;
            root = root.right;
        }
        return ans;
    }
}
