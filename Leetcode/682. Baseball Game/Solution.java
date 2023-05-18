import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<Integer>();
        int sum=0;
        for(String c:operations)
        {
            if(c.equals("C"))
            {
                sum-=stack.pop();
            }
            else if(c.equals("D"))
            {
                int temp = stack.peek()*2;
                stack.push(temp);
                sum+=temp;
            }
            else if(c.equals("+"))
            {
                int temp1=stack.pop();
                int temp2 = stack.peek();
                stack.push(temp1);
                stack.push(temp1+temp2);
                sum+=(temp1+temp2);
            }
            else
            {
                stack.push(Integer.parseInt(c));
                sum+=Integer.parseInt(c);
            }
        }
        return sum;
    }
}