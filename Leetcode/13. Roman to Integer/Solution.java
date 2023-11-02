class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char[] ch = s.toCharArray();

        int i=0;
        int sum=0;
        while(i<ch.length)
        {
            int curr = map.get(ch[i]);
            if(i+1<ch.length && curr < map.get(ch[i+1]))
            {
                sum-=curr;
            }
            else
            {
                sum+=curr;
            }
            i++;
        }
        return sum;
    }
}