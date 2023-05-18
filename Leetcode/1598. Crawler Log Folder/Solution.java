class Solution {
    public int minOperations(String[] logs) {
        // Stack<String> stack = new Stack<String>();
        int step=0;
        for(String str:logs)
        {
            if(str.equals("./")){continue;}
            else if(str.equals("../"))
            {
                // if(stack.size()>0)
                //     stack.pop();
                if(step>0)
                    step--;
            }
            else 
                // stack.push(str);
                step++;
        }
        return step;
    }
}