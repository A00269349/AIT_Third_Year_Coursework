/**
 * The type Simple thread.
 * @author Raphael Salaja
 * @version 10/10/21
 */
public class SimpleThread extends Thread
{
    public SimpleThread(String str) {
        super(str);
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + " " + getName());
            try {
                sleep((1000));
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("DONE! " + getName());
    }
}
