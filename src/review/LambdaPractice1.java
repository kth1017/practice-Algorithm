package review;

import java.util.concurrent.Callable;

public class LambdaPractice1 {
    public static void main(String[] args) throws Exception {
        // runnable
        Runnable runnable = () -> System.out.println("Hello, World!");
        new Thread(runnable).start();

        // callable
        Callable<Integer> callable = () -> 1;
        System.out.println(callable.call());
    }

}
