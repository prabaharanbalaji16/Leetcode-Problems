import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.*/
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root==null) return list;
        return helper(root,list);
    }

    private List<Integer> helper(TreeNode root,List<Integer> list)
    {
        if(root==null) return null;
        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
        return list;
    }
}