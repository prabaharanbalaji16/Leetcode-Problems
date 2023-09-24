import java.util.HashMap;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        HashMap<Character,Integer> row = new HashMap<>();
        HashMap<Character,Integer> col = new HashMap<>();
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j] !='.')
                {
                    if(row.containsKey(board[i][j]))
                        return false;
                    row.put(board[i][j],1);
                }
                if(board[j][i] !='.')
                {
                    if(col.containsKey(board[j][i]))
                        return false;
                    col.put(board[j][i],1);
                }
            }
            row.clear();
            col.clear();
        }
        
        for (int k = 0; k < 9; k++) {
            boolean[] used = new boolean[9];    
            for (int i = k / 3 * 3; i < k / 3 * 3 + 3; i++) {
                for (int j = k / 3 * 3; j < k / 3 * 3 + 3; j++) {
                    System.out.print(i+""+j+" ");
                    char c = board[i][j];
                    if (c != '.') {
                        int idx = c - '1';
                        if (used[idx]) {
                            return false;
                        }
                        used[idx] = true;
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

        return true;
    }

}