class Solution {
    public int maxArea(int[] height) {
        int n = height.length,i=0,j=n-1,water=0,ans=0;
        while(i<j)
        {
            // Here we are using area of reactangle
            // We are using min height bcoz if we you max for height
            // it might lead to water overflow.
            if(height[i]<height[j])
            {
                water = (j-i)*height[i];
                i++;
            }
            else
            {
                water = (j-i)*height[j];
                j--;
            }
            if(ans<water)
                ans = water;
        }
        return ans;
    }
}