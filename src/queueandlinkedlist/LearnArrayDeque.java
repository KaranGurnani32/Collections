package queueandlinkedlist;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {

        //We can add and delete elements from both sides in the array
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23); //adds element in last - queue fn
        adq.offerFirst(12); // adds element in beginning - deque fn
        adq.offerLast(45); // adds element in end (same as offer) - deque fn
        adq.offer(26);

        System.out.println(adq);

        System.out.println(adq.peek()); //works same as peek first - fn of queue
        System.out.println(adq.peekFirst()); // fn of deque
        System.out.println(adq.peekLast()); // fn of deque

        System.out.println(adq.poll()); //works same as poll first
        System.out.println("poll()" + adq);

        System.out.println(adq.pollFirst()); // fn of deque
        System.out.println("pollFirst() " + adq);

        //we can use it in stack by implementing offer and pollLast method
        System.out.println(adq.pollLast());  // fn of deque
        System.out.println("pollLast() " + adq);
    }
}
