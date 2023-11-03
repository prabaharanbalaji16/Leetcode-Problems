class Solution {
    public int lengthOfLastWord(String s) {
        if(s=="") return 0;
        
        int i=s.length()-1;
        int count=0;

        while(i>=0)
        {
            if(s.charAt(i)!=' ')
                count++;
            else
            {
                if(count>0)
                    return count;
            }

            i--;
        }
        return count;
        
    }
}