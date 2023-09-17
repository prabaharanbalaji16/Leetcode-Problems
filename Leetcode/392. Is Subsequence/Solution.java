class Solution {
    public boolean isSubsequence(String s, String t) {
        // int n = s.length(),m = t.length();
        if(s.equals(""))
            return true;
        else if(t.equals(""))
            return false;
        int i=0,j=0;
        while(i<s.length() && j<t.length())
        {
            if(s.charAt(i)==t.charAt(j))
                i++;
            j++;
        }
        if(i==s.length())
            return true;
        return false;
    }
}