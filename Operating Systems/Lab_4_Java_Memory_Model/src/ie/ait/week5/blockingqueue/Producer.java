package ie.ait.week5.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private final BlockingQueue<Integer> queue;

    @Override
    public void run() {

        try {
            process();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

    private void process() throws InterruptedException {

        // Put 20 ints into Queue and sleep for 100ms
      

    }

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
}