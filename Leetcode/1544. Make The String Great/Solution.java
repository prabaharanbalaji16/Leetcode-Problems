// import java.util.Stack;

class Solution {
    public String makeGood(String s) {
        // Stack<Character> stack = new Stack<Character>();
        StringBuffer str = new StringBuffer();
        int n = s.length();
        // for(int i=n-1;i>=0;i--)
        // {
        //     if(stack.size()>0 && Math.abs(stack.peek()-s.charAt(i))==32)
                        
        //         stack.pop();
        //     else
        //         stack.push(s.charAt(i));
        // }
        // while(!stack.isEmpty())
        // {
        //     str.append(stack.pop());
        // }
        // return str.toString();

        for(int i=0;i<n;i++)
        {
            int len = str.length();
            if(len > 0 && Math.abs(str.charAt(len-1)-s.charAt(i))==32)
                str.deleteCharAt(len-1);
            else
                str.append(s.charAt(i));
        }
        return str.toString();
    }
}