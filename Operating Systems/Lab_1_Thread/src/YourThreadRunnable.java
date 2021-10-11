import java.util.Locale;
/**
 * The type Your thread runnable.
 * @author Raphael Salaja
 */
public class YourThreadRunnable implements Runnable
{
    String name;
    boolean half_time;
    long start_time,
    end_time,
    time_elapsed;
    public YourThreadRunnable(String name, boolean half_time) {
        this.name = name;
        this.half_time = half_time;
    }
    private void printDetails() {
        System.out.println();
        System.out.println("----------- THREAD TABLE -----------");
        System.out.println("  STATUS OF " + name.toUpperCase(Locale.ROOT) + " DONE  ");
        System.out.println("  TIME ELAPSED IN SECONDS " + Math.round(time_elapsed / 1000.0));
        System.out.println("-----------------------------------");
        System.out.println();
    }
    @Override
    public void run() {
        start_time = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + " " + name);
            try {
                int time = half_time ? 500 : 1000;
                Thread.sleep((long) (Math.random() * time));
            }
            catch (InterruptedException e) {
            }
        }
        end_time = System.currentTimeMillis();
        time_elapsed = end_time - start_time;
        printDetails();
    }
}
