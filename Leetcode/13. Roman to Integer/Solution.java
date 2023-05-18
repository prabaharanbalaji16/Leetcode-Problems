class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        var words = s.toCharArray();
        int result = 0;
        for(int i=0;i<s.length();i++)
        {
            int curr = map.get(words[i]);
            if(i+1<s.length() && curr < map.get(words[i+1]) )
            {
                result = result-curr;
            }
            else
            {
                result = result+curr;
            }
        }
        return result;
    }
}