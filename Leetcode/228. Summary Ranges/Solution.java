import java.util.*;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int j=i;
            while(i<nums.length-1 && nums[i]+1 == nums[i+1])
                i++;
            if(i==j)
                list.add(new String(nums[i]+""));
            else list.add(new String(nums[j]+"->"+nums[i]));
        }
        return list;
    }
}