class Solution1 {
    public int bitwiseComplement(int n) {
        Stack<Integer> stack = new Stack<Integer>();
        if(n==0)
        {
            return 1;
        }
        while(n>1)
        {
            stack.push(n%2);
            n=n/2;
            if(n==1)
            {
                stack.push(1);                
            }
        }
        int reverse = 0;
        int size = stack.size();
        System.out.print(stack);
        int i=1;
        while(!stack.empty())
        {
            if(stack.peek()==1)
            {
                reverse = reverse +(int)(0*Math.pow(2,(size-i)));
                stack.pop();
            }
            else
            {
                reverse = reverse +(int)(1*Math.pow(2,(size-i)));
                stack.pop();
            }
                
            i++;
        }
        return reverse;

    }
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        sol.bitwiseComplement(7);
    }
}