public class Running_Sum_of_1d_Array
{
    public static void main(String[] args) {
        Running_Sum_of_1d_Array runningSum = new Running_Sum_of_1d_Array();
        int[] num = new int[]{1,7,3,6,5,6};
        int[] arr = runningSum.runningSum(num);
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++)
        {
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
}