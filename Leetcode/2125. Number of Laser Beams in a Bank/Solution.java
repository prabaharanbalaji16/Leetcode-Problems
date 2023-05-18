class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int prev=0,total=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(char s:bank[i].toCharArray())
            {
                count += (s-'0');
            }
            if(count>0)
            {
                total += (count* prev);
                prev = count;
            }
        }
        return total;
    }
}
