package leetcode.no0933_最近的请求次数;

import java.util.ArrayDeque;
import java.util.Queue;

class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
        queue = new ArrayDeque<>();
    }
    
    public int ping(int t) {
        queue.offer(t);
        while (queue.peek()<t-3000) {
            queue.poll();
        }
        
        return queue.size();
    }
}