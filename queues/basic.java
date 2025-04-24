package queues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class basic

{
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        Queue <Integer> q2= new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.poll();

        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.element());
        System.out.println(q.size());
    }
}
