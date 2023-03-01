class Solution {
    public int titleToNumber(String columnTitle) {
        if(columnTitle==null) return -1;
        int sum=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            char c = columnTitle.charAt(i);
            sum =sum*26;
            sum += (c-'A'+1);
        }
        return sum;
    }
}