import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node. */
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root==null) return list;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        TreeNode prev = null;
        while(!stack.isEmpty())
        {
            TreeNode curr = stack.peek();
            if(prev==null || prev.left ==curr || prev.right == curr)
            {
                if(curr.left !=null)
                    stack.push(curr.left);
                else if(curr.right!=null)
                    stack.push(curr.right);
                else
                {
                    stack.pop();
                    list.add(curr.val);
                }
            }
            else if(curr.left==prev)
            {
                if(curr.right!=null)
                    stack.push(curr.right);
                else
                {
                    stack.pop();
                    list.add(curr.val);
                }
            }
            else if(curr.right==prev)
            {
                stack.pop();
                list.add(curr.val);
            }
            prev = curr;
        }
        return list;
    }

}