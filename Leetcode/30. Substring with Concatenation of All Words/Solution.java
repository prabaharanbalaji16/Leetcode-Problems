import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(String word:words)
        {
            map.put(word,map.getOrDefault(word,0)+1);
        }
        int wordLen = words[0].length();
        int num = words.length;
        int sLen = s.length();
        for(int i=0;i<sLen-num*wordLen+1;i++)
        {
            String sub = s.substring(i,i+num*wordLen);
            if(isConcat(sub,map,wordLen))
            {
                list.add(i);
            }
        }
        return list;
    }

    private boolean isConcat(String sub,HashMap<String,Integer> map,int wordLen)
    {
        HashMap<String,Integer> words = new HashMap<>();
        for(int i=0;i<sub.length();i+=wordLen)
        {
            String sWord = sub.substring(i,i+wordLen);
            words.put(sWord,words.getOrDefault(sWord,0)+1);
        }
        return words.equals(map);
    }
}