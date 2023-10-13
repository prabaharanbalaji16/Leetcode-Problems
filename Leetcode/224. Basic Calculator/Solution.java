import java.util.Stack;

class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int ans=0,num=0,sign=1;
        char[] str = s.toCharArray();
        for(char st:str)
        {
            if(st=='+')
            {
                ans +=sign*num;
                num=0;
                sign=1;
            }
            else if(st=='-')
            {
                ans+=sign*num;
                num=0;
                sign=-1;
            }
            else if(st=='(')
            {
                stack.push(ans);
                stack.push(sign);
                sign=1;
                ans=0;
            }
            else if(st==')')
            {
                ans+=sign*num;
                num=0;
                ans*=stack.pop();
                ans+=stack.pop();
            }
            // else if(st.equals(" ")) continue;
            else if(Character.isDigit(st))
                num = num*10+(int)(st-'0');
        }
        if(num!=0)
            ans+=sign*num;
        return ans;
    }
}