/**
 * The type Two threads runnable.
 * @author Raphael Salaja
 */
class TwoThreadsRunnable
{
    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Runnable s1 = new SimpleThreadRunnable("Jamaica");
        Thread t1 = new Thread(s1);
        Runnable s2 = new SimpleThreadRunnable("Fiji");
        Thread t2 = new Thread(s2);
        t1.start();
        t2.start();
    }
}
