import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        // Queue<Character> queue = new LinkedList<Character>();
        int len = s.length();
        // for(int i=0;i<len;i++)
        // {
        //    queue.add(s.charAt(i));
        // }
        // while(len>0)
        // {
        //     char temp = queue.remove();
        //     if(!queue.contains(temp))
        //     {
        //         return s.indexOf(temp);
        //     }
        //     else
        //     {
        //         queue.add(temp);
        //     }
        //     len--;
        // }
        // return -1;

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<len;i++)
        {
            if(map.get(s.charAt(i))!=null)
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<len;i++)
        {
            if(map.get(s.charAt(i))==1)
            {
                return s.indexOf(s.charAt(i));
            }
        }
        return -1;
    }
}