package ie.ait.week5.blockingqueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class Main
{
    public static void main(String[] args) {
        BlockingQueue<Integer> buffer = new ArrayBlockingQueue<Integer>(10);
        Thread p_1 = new Producer(buffer, 0);


        p_1.start();


        Thread c = new Consumer(buffer);
        c.start();
    }
}