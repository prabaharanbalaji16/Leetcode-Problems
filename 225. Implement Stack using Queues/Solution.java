import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    int n ;
    public MyStack() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
        n =0;
    }
    
    public void push(int x) {
        if(queue1.size()==0 && queue2.size()!=0)
        {
            queue2.add(x);
        }
        else queue1.add(x);
    }
    
    public int pop() {
        if(!queue1.isEmpty())
        {
            while(queue1.size()>1)
            {
                queue2.add(queue1.remove());
            }
            return queue1.remove();
        }
        else
        {
            while(queue2.size()>1)
            {
                queue1.add(queue2.remove());
            }
            return queue2.remove();
        }
    }
    
    public int top() {
        int first = 0;
        if(!queue1.isEmpty())
        {
            while(queue1.size()>1)
            {
                queue2.add(queue1.remove());
            }
            first = queue1.peek();
            queue2.add(queue1.remove());
        }
        else
        {
            while(queue2.size()>1)
            {
                queue1.add(queue2.remove());
            }
            first = queue2.peek();
            queue1.add(queue2.remove());
        }
        return first;
    }
    
    public boolean empty() {
        return queue1.size()==0 && queue2.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */