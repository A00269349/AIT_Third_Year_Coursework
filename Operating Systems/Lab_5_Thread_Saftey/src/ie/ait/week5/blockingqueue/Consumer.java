package ie.ait.week5.blockingqueue;
import java.util.concurrent.BlockingQueue;
public class Consumer extends Thread implements Runnable {
    private final BlockingQueue<Integer> queue;
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                Integer x = queue.poll();
                if (x == null) {
                    System.out.println(" CONSUMER DONE ");
                    break;
                }
                process(x);
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