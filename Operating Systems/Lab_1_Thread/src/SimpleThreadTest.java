public class SimpleThreadTest {
    public static void main(String[] args) {
        new SimpleThread("Dog").start();
        new SimpleThread("Cat").start();
        new SimpleThread("Fish").start();
    }
}