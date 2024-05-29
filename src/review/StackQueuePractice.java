package review;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueuePractice {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

}
