/**
 * The type Two threads test.
 * @author Raphael Salaja
 */
public class TwoThreadsTest
{
	/**
	 * The entry point of application.
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        new SimpleThread("Jamaica").start();
        new SimpleThread("Fiji").start();
    }
}