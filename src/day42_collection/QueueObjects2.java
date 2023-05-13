package day42_collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueObjects2 {
    public static void main(String[] args) {
        PriorityQueue<String > queue =new PriorityQueue<>();
        queue.offer("hello");
        queue.offer("world");
        queue.offer("java");
        queue.offer("selenium");
        queue.offer("apple");
        queue.offer("zebra");
        queue.offer("api");
        queue.offer("database");
        queue.offer("data");
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
       arrayDeque.offer("hello");
       arrayDeque.offer("world");
       arrayDeque.offer("java");
       arrayDeque.offer("selenium");
       arrayDeque.offer("apple");
       arrayDeque.offer("zebra");
       arrayDeque.offer("data");
        System.out.println("----------------------");
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque);
        arrayDeque.offer("database");
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekLast());
        arrayDeque.offerFirst("api");
        System.out.println(arrayDeque);

    }
}
