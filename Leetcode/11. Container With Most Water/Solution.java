// Here we are using area of reactangle
            // We are using min height bcoz if we you max for height
            // it might lead to water overflow.
class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j= height.length-1;
        int maxarea = 0;
        while(i<j)
        {
            int h;
            if(height[i]<height[j]){
                h= height[i];
                i++;
            }    
            else
            {
               h=height[j];
               j--; 
            }
            if(maxarea<(h*(j-i+1)))
                maxarea = h*(j-i+1);
        }
        return maxarea;
    }
}