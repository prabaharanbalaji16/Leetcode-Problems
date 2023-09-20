import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0,j=0;
        Set<Character> map = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(!map.contains(s.charAt(i)))
            {
                map.add(s.charAt(i));
                len = Math.max(len,map.size());
            }
            else
            {
                while( s.charAt(j)!=s.charAt(i))
                {
                    map.remove(s.charAt(j));
                    j++;
                }
                map.remove(s.charAt(j));
                j++;
                map.add(s.charAt(i));
            }
        }
        return len;
    }
}