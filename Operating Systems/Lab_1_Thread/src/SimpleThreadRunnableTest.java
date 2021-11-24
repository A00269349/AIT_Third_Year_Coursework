/**
 * The type Simple thread test.
 * @author Raphael Salaja
 * @version 10/10/21
 */
public class SimpleThreadRunnableTest
{
    public static void main(String[] args) {
        Thread t1 = new Thread(new SimpleThreadRunnable(1));
        t1.start();
    }
}