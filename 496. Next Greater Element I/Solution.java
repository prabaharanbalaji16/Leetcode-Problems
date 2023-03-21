import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int n:nums2)
        {
            while(st.size()>0 && st.peek() < n )
                map.put(st.pop(),n);
            st.push(n);
        }
        
        int [] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            ans[i] = map.getOrDefault(nums1[i],-1);
        }

        return ans;
    }
}

