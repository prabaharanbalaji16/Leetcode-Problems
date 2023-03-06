import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
            List<Integer> arr = new ArrayList<>();
            long num = 1;
            for(int j=1;j<=rowIndex+1;j++)
            {
                arr.add((int)num);
                num = num *((rowIndex+1)-j)/j;
            }
        return arr;
    }
}