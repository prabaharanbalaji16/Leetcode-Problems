import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if(s.length()==1) return false;
        var string = s.toCharArray(); 
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(string[i]=='(' || string[i]=='{' || string[i]=='[')
            {
                stack.push(string[i]);
            }
            else if(string[i]==')')
            {
                if(stack.isEmpty()) return false;
                if(stack.peek()=='(')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }else if(string[i]=='}')
            {
                if(stack.isEmpty()) return false;
                if(stack.peek()=='{')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(string[i]==']')
            {
                if(stack.isEmpty()) return false;
                if(stack.peek()=='[')
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}