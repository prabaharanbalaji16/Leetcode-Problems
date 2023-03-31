import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> groups = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> list= groups.get(groupSizes[i]);
            if(list==null)
                list = new ArrayList<>();
            list.add(i);
            groups.put(groupSizes[i],list);
            if(list.size()==groupSizes[i])
            {
                result.add(list);
                groups.put(groupSizes[i],new ArrayList<>());
            }
        }
        return result;
    }
}