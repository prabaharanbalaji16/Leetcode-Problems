class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.numberOfSteps(2);
    }
    public int numberOfSteps(int num) {
        int steps = 0;
        while(num>0)
        {
            if(num%2==0)
            {
                num = num/2;
                steps++;
            }
            else
            {
                num-=1;
                steps++;
            }
        }
        return steps;
    }
}