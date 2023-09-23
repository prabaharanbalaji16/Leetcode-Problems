import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
            return "";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        int count=0,j=0, min_len=Integer.MAX_VALUE,min_start=0;

        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(map.get(s.charAt(i))>0)
                    count++;
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
            }
            if(count==t.length())
            {
                while(j<i && (!map.containsKey(s.charAt(j)) || map.get(s.charAt(j))<0))
                {
                    if(map.containsKey(s.charAt(j)))
                    {
                        map.put(s.charAt(j), map.get(s.charAt(j))+1);
                    }
                    j++;
                }
                if(min_len > i-j+1)
                {
                    min_len = i-(min_start=j)+1;
                }
                if(map.containsKey(s.charAt(j)))
                {
                    map.put(s.charAt(j), map.get(s.charAt(j))+1);
                }
                count--;
                j++;
            }
        }
        return min_len == Integer.MAX_VALUE ? "" : s.substring(min_start, min_start+min_len);
         
    }
}