import java.util.Stack;

/**
 * Definition for a binary tree node.  */
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public TreeNode increasingBST(TreeNode root) {
        if(root==null) return null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        helper(root,stack);
        TreeNode node =null;
        TreeNode prev =null;
        while(!stack.isEmpty())
        {
            node = stack.pop();
            node.left = null;
            node.right = prev;
            prev = node;
        }

        return node;
    }

    private void helper(TreeNode root,Stack<TreeNode> stack)
    {
        if(root==null) return;
        helper(root.left,stack);
        stack.push(root);
        helper(root.right,stack);
    }
}