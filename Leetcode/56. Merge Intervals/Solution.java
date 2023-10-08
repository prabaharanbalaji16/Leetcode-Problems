import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for(int i=1;i<intervals.length;i++)
        {
            int size = list.size()-1;
            int[] overlap = list.get(size);
            if(overlap[1] >= intervals[i][0])
            {
                overlap[1] = Math.max(intervals[i][1],overlap[1]);
                list.set(size,overlap);
            }
            else list.add(intervals[i]);
        }
        return list.toArray(new int[list.size()][]);
    }
}