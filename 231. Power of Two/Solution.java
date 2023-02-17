class Solution {
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
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isPowerOfTwo(16);
    }
}
