import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        for(int s:students)
        {
            queue.add(s);
        }
        for(int i=sandwiches.length-1;i>=0;i--)
        {
            stack.push(sandwiches[i]);
        }
        int counter=0;
        while(!stack.isEmpty())
        {
            int student = queue.remove();
            if(stack.peek()==student)
            {
                stack.pop();
                counter=0;
            }
            else
            {
                counter++;
                queue.add(student);
                if(counter==queue.size())
                    return counter;
            }
        }
        return 0;
    }
}