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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        zigzag(root,list,0);
        // int i = list.size();
        for(int i=0;i<list.size();i++)
        {
            if((i%2==0)) Collections.reverse(list.get(i));
        }
        return list;
    }
    void zigzag(TreeNode root,List<List<Integer>> list, int level)
    {
        if(root==null) return;

        if(list.size()==level)
        {
            List<Integer> l = new ArrayList<>();
            l.add(root.val);
            list.add(l);
        }
        else
            list.get(level).add(root.val);

        zigzag(root.right,list,level+1);
        zigzag(root.left,list,level+1);

        // if(RL)
        // {
        //     zigzag(root.left,list,level+1,true);
        //     zigzag(root.right,list,level+1,false);
        // }
        // else
        // {
        //     zigzag(root.right,list,level+1,false);
        //     zigzag(root.left,list,level+1,true);
        // }
    }
}