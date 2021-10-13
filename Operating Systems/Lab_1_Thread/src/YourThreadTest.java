/**
 * The type Your thread test.
 * @author Raphael Salaja
 */
public class YourThreadTest
{
    public static void main(String[] args) {
        new YourThreadRunnable("<|THREAD HALF TIME|", false);
        new YourThreadRunnable("<|THREAD NORMAL TIME|>", true);
    }
}
