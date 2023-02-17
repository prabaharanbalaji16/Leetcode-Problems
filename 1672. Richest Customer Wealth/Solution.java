class Solution {
    public int maximumWealth(int[][] accounts) {
        int m= accounts.length;
        int richest = 0;
        for(int i=0;i<m;i++)
        {
            int rich = 0;
            for(int j=0;j<accounts[i].length;j++)
            {
                rich +=accounts[i][j];
            }

            if(rich>richest)
            {
                richest = rich;
            }
        }
        return richest;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        solution.maximumWealth();
    }
}