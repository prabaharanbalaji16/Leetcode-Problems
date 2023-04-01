class Solution {
    public int[] minOperations(String boxes) {
        int len = boxes.length();
        int[] left = new int[len];
        int[] right = new int[len];
        int prev = (boxes.charAt(0)=='0')?0:1;
        for(int i=1;i<len;i++)
        {
            left[i] += left[i-1]+prev;
            prev += (boxes.charAt(i)=='0')?0:1;
        }

        prev = (boxes.charAt(len-1)=='0')?0:1;
        for(int i=len-2;i>=0;i--)
        {
            right[i] += right[i+1]+prev;
            prev += (boxes.charAt(i)=='0')?0:1;
        }
        int[] ans = new int[len];
        for(int i=0;i<len;i++)
        {
            ans[i] = left[i]+right[i];
        }
        return ans;
    }
}