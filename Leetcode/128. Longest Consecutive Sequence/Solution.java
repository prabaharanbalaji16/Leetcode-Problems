import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> map = new HashSet<>();
        for(int i=0;i<n;i++)
            map.add(nums[i]);
        int count=0,max=0,longest=0;
        
        for(int i:map)
        {
            if(!map.contains(i-1))
            {
                max=1;
                longest = i;
                while( map.contains(longest+1))
                {
                    max+=1;
                    longest+=1;
                }
            }
            count=Math.max(count,max);
        }
        return count;
    }
}
