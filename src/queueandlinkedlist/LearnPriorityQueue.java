package queueandlinkedlist;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
//      comparator used for max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // comparator used for max heap

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        //follows min heap
        System.out.println(pq);
        System.out.println(pq.peek());

        //priority is small element
        pq.poll();
        System.out.println(pq);
    }
}
