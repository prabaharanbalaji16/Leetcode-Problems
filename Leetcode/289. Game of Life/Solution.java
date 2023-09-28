class Solution {
    public void gameOfLife(int[][] board) {
        
        int n = board.length;
        int m = board[0].length;
        int[][] matrix = new int[n][m];
// (-1,-1)(-1,0)(-1,1)(0,-1)(0,1)(1,-1)(1,0)(1,1)

        // int row[] =new int[]{-1,-1,-1,0,0,1,1,1};
        // int col[] =new int[]{-1,0,1,-1,1,-1,0,1};
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int sum=0;
                // for(int k=0;k<row.length;k++)
                // {
                //     if( (i+row[k]<0) || (i+row[k]>n-1) || (j+col[k]<0) || 
                //                                 (j+col[k])>m-1 )
                //     {
                //         continue;
                //     }
                //     sum+=board[i+row[k]][j+col[k]];
                // }
                if(i-1>-1 && j-1>-1) sum+=board[i-1][j-1];
                if(i-1>-1) sum+=board[i-1][j];
                if(i-1>-1 && j+1<m) sum+=board[i-1][j+1];
                if(j-1>-1) sum+=board[i][j-1];
                if(j+1<m) sum+=board[i][j+1];
                if(i+1<n && j-1>-1) sum+=board[i+1][j-1];
                if(i+1<n) sum+=board[i+1][j];
                if(i+1<n && j+1<m) sum+=board[i+1][j+1];

                if(board[i][j]==0)
                {
                    if(sum==3) matrix[i][j]=1;
                    else matrix[i][j]=0;
                }
                else
                {
                    if(sum==2 || sum==3) matrix[i][j]=1;
                    else matrix[i][j]=0;
                }
            }
        }
        for(int e=0;e<n;e++){
            for(int f=0;f<m;f++){
                board[e][f]=matrix[e][f];
            }
        }
    }
}