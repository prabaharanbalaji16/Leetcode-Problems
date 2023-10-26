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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0 || inorder.length==0 || inorder.length!=preorder.length)
            return null;

        return buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode buildTree(int[] preOrder, int preStart,int preEnd, int[] inOrder, int inStart, int inEnd)
    {
        if(preStart > preEnd || inStart > inEnd)
            return null;

        TreeNode curr = new TreeNode(preOrder[preStart]);
        int offset = inStart;

        for(;offset<inEnd;offset++)
        {
            if(inOrder[offset]==curr.val)
                break;
        }
        curr.left = buildTree(preOrder,preStart+1,preStart+offset-inStart,inOrder,inStart,offset-1);
        curr.right = buildTree(preOrder,preStart+offset-inStart+1,preEnd,inOrder,offset+1,inEnd);

        return curr;
    }
}