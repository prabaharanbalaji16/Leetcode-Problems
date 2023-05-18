class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        else if(n==1) return 1;
        else return helper(0,1,n-2);
    }
    int helper(int num1,int num2,int n)
    {
        if(n<0) return num2;
        return helper(num2,num1+num2,n-1);
    }
}