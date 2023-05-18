class Solution2 {
    public boolean isPowerOfTwo(int n) {
        if(n==0)
        {
            return false;
        }
        else
        {
            return (int)Math.ceil(Math.log(n)/Math.log(2))== 
            (int)Math.floor(Math.log(n)/Math.log(2));
        }
    }
}