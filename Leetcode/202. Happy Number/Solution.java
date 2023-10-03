import java.util.HashMap;
class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int square = 0,digit=0;
        while(n!=1 && !map.containsKey(n))
        {
            map.put(n,1);
            while(n>0)
            {
                digit = n%10;
                square +=digit * digit;
                n = n/10;
            }
            n=square;
            square = 0;
        }
        return n==1;
    }   
}
