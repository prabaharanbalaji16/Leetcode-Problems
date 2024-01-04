class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length==0)
            return 0;
        int maxArea =0;
        int n = heights.length;
        int[] fromLeft = new int[n];
        int[] fromRight = new int[n];
        fromLeft[0] =-1;
        fromRight[n-1] = n;

        for(int i=1;i<n;i++)
        {
            int p = i-1;
            while(p>=0 && heights[p]>=heights[i])
                p = fromLeft[p];
            fromLeft[i] = p;
        }

        for(int i=n-2;i>=0;i--)
        {
            int p =i+1;
            while(p<n && heights[p]>=heights[i])
            {
                p = fromRight[p];
            }
            fromRight[i] = p;
        }

        for(int i=0;i<n;i++)
        {
            maxArea = Math.max(maxArea,heights[i]*(fromRight[i] - fromLeft[i] -1));
        }
        return maxArea;
    }
}
