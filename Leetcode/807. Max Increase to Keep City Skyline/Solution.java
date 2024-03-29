class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        int n = grid.length;
        int[] rowMax= new int[n];
        int[] colMax = new int[n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                rowMax[i] = Math.max(rowMax[i],grid[i][j]);
                colMax[j] = Math.max(colMax[j],grid[i][j]);
            }
        }
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                result+=Math.min(rowMax[i],colMax[j])-grid[i][j];
            }
        }
        return result;
    }
}