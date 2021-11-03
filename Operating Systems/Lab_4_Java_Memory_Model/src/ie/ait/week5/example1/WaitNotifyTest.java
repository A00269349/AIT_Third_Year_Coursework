package ie.ait.week5.example1;
/**
 * WAIT NOTIFY TEST
 * @author Raphael Salaja
 * @version 3/11/21
 */
public class WaitNotifyTest {

    public static void main(String[] args) {
        // CREATE A Message(), TWO Waiters(msg), AND A Notifier(msg)
        Message message = new Message(" ");
        Waiter waiter_1 = new Waiter(message);
        Waiter waiter_2 = new Waiter(message);
        Notifier notifier = new Notifier(message);

    	// START WAITERS AND NOTIFIER
        Runnable run_waiter_1 = waiter_1;
        Runnable run_waiter_2 = waiter_2;
        Runnable run_notifier_1 = notifier;

        Thread thread_run_waiter_1 = new Thread(run_waiter_1, "Waiter 1");
        Thread thread_run_waiter_2 = new Thread(run_waiter_2, "Waiter 2");
        Thread thread_run_notifier_1 = new Thread(run_notifier_1, "Notifier 1");

        thread_run_waiter_1.start();
        thread_run_waiter_2.start();
        thread_run_notifier_1.start();

        // PRINT MESSAGE "ALL THE THREADS ARE STARTED"
        System.out.println("ALL THE THREADS ARE STARTED");
    }
}
