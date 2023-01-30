public class BinarySearch
{
    public static void main(String args[])
    {
        BinarySearch bs = new BinarySearch();
        int[] nums = new int[]{-1,0,3,5,9,12};
        int index = bs.search(nums,4);
        if(index!=-1)
        {
            System.out.println("Element is present at index: "+index);
        }
        else 
        {
            System.out.println("Element is not present ");
        }
    }
    public int search(int[] nums, int target) {
        return search(0,nums,nums.length-1,target);
    }

    private int search(int low,int[] nums, int high, int target)
    {
        int mid = -1;

        if(high>=low)
        {
        mid = low+(high-low)/2;

            if(target == nums[mid])
            {
                return mid;
            }
            if(target < nums[mid])
            {
                return search(low,nums,mid-1,target);
            }
            if(target > nums[mid])
            {
                return search(mid+1,nums,high,target);
            }
        }
        
        return -1;
    }
}