class Solution {
    public int maxDepth(String s) {
        int count = 0,max = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                count++;
                if(count>max)
                    max=count;
            }
            else if(s.charAt(i)==')')
                count--;
        }
        return max;
    }
}
