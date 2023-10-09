import java.util.*;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int[][] temp = new int[intervals.length+1][];
        int i=0;
        
        for( i=0;i<intervals.length;i++)
        {
            temp[i] = intervals[i];
        }
        temp[i++] = newInterval;

        Arrays.sort(temp,(a,b)->Integer.compare(a[0],b[0]));
        for(int j=0;j<temp.length;j++)
        {
            int size = list.size()-1;
            if(size<0)
                list.add(temp[j]);
            else
            {
                int[] overlap = list.get(size);
                if(overlap[1]>=temp[j][0])
                {
                    overlap[1] = Math.max(temp[j][1],overlap[1]);
                    list.set(size,overlap);
                }
                else list.add(temp[j]);
            }
        }
       
        return list.toArray(new int[list.size()][]);
    }
}