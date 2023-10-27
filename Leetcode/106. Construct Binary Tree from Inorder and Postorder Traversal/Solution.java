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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length==0 || inorder.length==0 || inorder.length!=postorder.length)
            return null;

        return buildTree(postorder,0,postorder.length-1,inorder,0,inorder.length-1);
    }

    TreeNode buildTree(int[] postOrder, int postStart, int postEnd, int[] inOrder, int inStart, int inEnd)
    {
        if(postStart > postEnd || inStart > inEnd)
            return null;

        int offset = inStart;

        TreeNode curr = new TreeNode(postOrder[postEnd]);


        for(;offset<inEnd;offset++)
        {
            if(curr.val==inOrder[offset])
                break;
        }

        curr.left =  buildTree(postOrder, postStart , postStart+offset-inStart-1 , inOrder ,inStart,offset-1);
        curr.right =  buildTree(postOrder,postStart+offset-inStart,postEnd-1,inOrder,offset+1,inEnd);
        
        return curr;
    }
}