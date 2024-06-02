package ex03;


import java.util.Deque;
import java.util.ArrayDeque;

public class DequePractice {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);

        System.out.println("Deque: " + deque);

        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from end: " + deque.removeLast());

        System.out.println("Deque after removals: " + deque);
    }
}