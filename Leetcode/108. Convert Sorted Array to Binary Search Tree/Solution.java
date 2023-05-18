class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        if(nums.length==0)
        {
            return null;
        }

        return fillTree(nums,0,nums.length-1);
    }
    TreeNode fillTree(int nums[],int low, int high)
    {
        if(low>high)
            return null; 
        int mid = (low+high)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = fillTree(nums,low,mid-1);
        root.right = fillTree(nums,mid+1,high);
        return root;
    }
}
class TreeNode{
    TreeNode(int val)
    {
        
    }
    TreeNode left;
    TreeNode right;
}