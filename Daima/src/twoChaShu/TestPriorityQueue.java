package twoChaShu;

import java.util.PriorityQueue;

public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        priorityQueue.offer(9);
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(7);
        priorityQueue.offer(3);
        priorityQueue.offer(6);
        while (!priorityQueue.isEmpty()){
            int cur= priorityQueue.poll();
            System.out.println(cur);
        }
    }
}
