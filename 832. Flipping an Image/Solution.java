class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] img:image)
        {
            int i=0;
            int n = img.length-1;
            while((i<img.length/2))
            {
                int temp = img[i];
                img[i] = img[n];
                img[n] = temp;
                n--;i++;
            }
            for(int j=0;j<img.length;j++)
            {
                if(img[j]==1)
                    img[j] =0;
                else img[j]=1;
            }
        }
        return image;
    }
}