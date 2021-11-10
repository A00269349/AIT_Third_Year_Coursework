package ie.ait.week5.blockingqueue;
import java.util.concurrent.BlockingQueue;
public class Producer extends Thread implements Runnable {
    private final BlockingQueue<Integer> queue;
    private final int start;
    @Override
    public void run() {
        try {
            process();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    private void process() throws InterruptedException {
        try {
            for (int i = start; i < 20 + start; i++) {
                System.out.println("[Producer] Puts : " + i);
                queue.put(i);
                try {
                    sleep((int) (Math.random() * 100));
                } catch (InterruptedException e) {
                }
            }
            System.out.println("Producer DONE! ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Producer(BlockingQueue<Integer> queue, int start) {
        this.queue = queue;
        this.start = start;
    }
}