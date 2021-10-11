/**
 * The type Simple thread test.
 * @author Raphael Salaja
 * @version 10/10/21
 */
public class SimpleThreadRunnableTest
{
    public static void main(String[] args) {
        Runnable r1 = new SimpleThreadRunnable("Dog");
        Runnable r2 = new SimpleThreadRunnable("Cat");
        Runnable r3 = new SimpleThreadRunnable("Fish");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();
    }
}