/**
 * The type Simple thread runnable.
 * @author Raphael Salaja
 * @version 10/10/21
 */
class SimpleThreadRunnable implements Runnable
{
    String name;
    public SimpleThreadRunnable(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + " " + name);
            try {
                Thread.sleep( 1000);
            }
            catch (InterruptedException e) {
            }
        }
        System.out.println("DONE! " + name);
    }
}
