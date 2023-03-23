import java.util.Stack;

class Solution2 {
    public String removeOuterParentheses(String s) {
    StringBuffer result = new StringBuffer();
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                if(stack.size()>=1)
                    result.append(s.charAt(i));

                stack.push(s.charAt(i));
            }
            else
            {
                if(stack.size()>1)
                    result.append(s.charAt(i));
                    
                stack.pop();
            }
        }
        return result.toString();
    }
}
