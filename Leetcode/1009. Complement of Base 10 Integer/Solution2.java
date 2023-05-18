// the run time of this solution is way more better than the runtime of the another solution

class Solution2 {
    public int bitwiseComplement(int n) {

        int x = 1;
        while(n>x)
        {
            x = 2*x+1;
        }
        return n^x;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        sol.bitwiseComplement(7);
    }
}