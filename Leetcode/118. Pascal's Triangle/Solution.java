import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0)
        {
            return null;
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            int num = 1;
            List<Integer> arr = new ArrayList<>();
            for(int j=1;j<=i;j++)
            {
                arr.add(num);
                num = num * (i - j) / j;
            }
            list.add(arr);
        }

        return list;
    }
}