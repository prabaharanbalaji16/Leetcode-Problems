import java.util.Stack;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int num1,num2;
        for(int i=0;i<tokens.length;i++)
        {
            switch(tokens[i])      // Instead of Switch we can also use If-Else
            {
                case "+":
                     num1 = stack.pop();
                     num2 = stack.pop();
                    stack.push(num2+num1);
                    break;
                case "-":
                     num1 = stack.pop();
                     num2 = stack.pop();
                    stack.push(num2-num1);
                    break;
                case "*":
                     num1 = stack.pop();
                     num2 = stack.pop();
                    stack.push(num2*num1);
                    break;
                case "/":
                     num1 = stack.pop();
                     num2 = stack.pop();
                    stack.push(num2/num1);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));
                    break;
            }
        }
        return stack.peek();
    }
}