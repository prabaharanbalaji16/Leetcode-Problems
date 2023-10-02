import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char c1= s.charAt(i);
            char c2= t.charAt(i);
            map1.put(c1,c2);
            map2.put(c2,c1);
        }
        // System.out.println(map1);
        // System.out.println(map2);

        for(int i=0;i<t.length();i++)
        {
            char c1= s.charAt(i);
            char c2= t.charAt(i);
            if(map1.get(c1)!=c2 || map2.get(c2)!=c1)
                return false;
        }
        return true;
    }
}
