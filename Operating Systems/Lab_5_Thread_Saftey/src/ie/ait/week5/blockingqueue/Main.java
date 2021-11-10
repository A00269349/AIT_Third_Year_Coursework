package ie.ait.week5.blockingqueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> buffer = new ArrayBlockingQueue<Integer>(10);
        Thread p_1 = new Producer(buffer, 5);
        /*
        Thread p_2 = new Producer(buffer, 1);
        Thread p_3 = new Producer(buffer, 3);
        Thread p_4  = new Producer(buffer, 4);
        */
        p_1.start();
        /*
        p_2.start();
         p_3.start();
         p_4.start();
         */
        Thread c = new Consumer(buffer);
        c.start();
    }
}