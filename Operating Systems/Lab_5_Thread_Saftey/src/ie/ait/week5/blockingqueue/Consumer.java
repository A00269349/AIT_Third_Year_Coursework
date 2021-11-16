package ie.ait.week5.blockingqueue;
import java.util.concurrent.BlockingQueue;
public class Consumer extends Thread implements Runnable {
    private final BlockingQueue<Integer> queue;
    @Override
    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                process(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private void process(Integer take) throws InterruptedException {
        System.out.println("[Consumer] Takes : " + take);
        Thread.sleep(500);
    }
    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
}