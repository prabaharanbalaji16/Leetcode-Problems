class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=i,min=Integer.MAX_VALUE,count=0,sum=0;
        while(j<nums.length)
        {
            count+=1;
            sum+=nums[j];
            while(sum>=target)
            {
                min = Math.min(min,count);
                sum-=nums[i];
                count--;
                i++;
            }
            j++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}