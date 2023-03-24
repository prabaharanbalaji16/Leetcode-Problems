// import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        // Stack<Character> stack = new Stack<Character>();
        StringBuilder str = new StringBuilder();
        
        for(int i=0;i<=s.length()-1;i++)
        {
            if(str.length()>0 &&str.charAt(str.length()-1)==s.charAt(i))
                str.deleteCharAt(str.length()-1);
            else
                str.append(s.charAt(i));
        }
        
        // while(!stack.isEmpty())
        // {
        //     str.append(stack.pop());
        // }
        return str.toString();
    }
}