import java.util.Locale;

public class YourThread extends Thread {
    private final boolean half_time;
    private long start_time, end_time, time_elapsed;

    public YourThread(String str, boolean half_time) {
        super(str);
        this.half_time = half_time;
    }

    private void printDetails() {
        System.out.println();
        System.out.println("----------- THREAD TABLE -----------");
        System.out.println("  STATUS OF " + getName().toUpperCase(Locale.ROOT) + " DONE  ");
        System.out.println("  TIME ELAPSED IN SECONDS " + Math.round(time_elapsed / 1000.0));
        System.out.println("-----------------------------------");
        System.out.println();
    }

    public void run() {
        start_time = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + " " + getName());
            try {
                int time = half_time ? 500 : 1000;
                sleep((long) (Math.random() * time));
            } catch (InterruptedException e) {
            }
        }
        end_time = System.currentTimeMillis();
        time_elapsed = end_time - start_time;
        printDetails();
    }


}