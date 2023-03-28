import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       Queue<Integer> queue = new LinkedList<>();
       for(int i=0;i<tickets.length;i++)
        {
            queue.add(i);
        }
        int timer=0;
        int result[] = new int[tickets.length];
        while(!queue.isEmpty())
        {
            int i = queue.poll();
            tickets[i]--;
            timer++;
            result[i] = timer;
            if(tickets[i]>0)
                queue.add(i);
        }
        return result[k];

        // int timeTaken = 0;
        // while(tickets[k] > 0) {
        // 	for(int i = 0; i < tickets.length; i++) {
        // 		if(tickets[i] > 0) {
        // 			tickets[i]--;
        // 			timeTaken++;
        // 		}
        //         if(tickets[k] == 0)  break;
        // 	}
        // }
        // return timeTaken;
    }
}