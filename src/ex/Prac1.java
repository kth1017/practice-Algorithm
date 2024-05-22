package ex;

import java.util.LinkedList;

public class Prac1 {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addFirst(30);
        numbers.addFirst(20);
        numbers.addFirst(10);
        numbers.add(1, 15);
        numbers.addLast(40);
        numbers.addLast(50);
        System.out.println(numbers);
        System.out.println(numbers.removeFirst());
        System.out.println(numbers);
        System.out.println(numbers.remove(1));
        System.out.println(numbers);
        System.out.println(numbers.removeLast());
        System.out.println(numbers);
    }

}
