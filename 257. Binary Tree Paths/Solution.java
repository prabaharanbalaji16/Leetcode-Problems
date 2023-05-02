import java.util.ArrayList;
import java.util.List;

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
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        helper(root,new StringBuilder());
        return list;
    }
    void helper(TreeNode root,StringBuilder ans)
    {
        int len = ans.length();
        if(root==null)
        {
            return;
        }
        ans.append(root.val);
        if(root.left==null && root.right==null)
        {
            list.add(ans.toString());
        }
        else
        {
            ans.append("->");
            helper(root.left,ans);
            helper(root.right,ans);
        }
        ans.setLength(len);
    }
}