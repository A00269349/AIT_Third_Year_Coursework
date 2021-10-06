public class YourThreadTest{
    public static void main(String[] args) {
        new YourThread("<|THREAD HALF TIME|", false).start();
        new YourThread("<|THREAD NORMAL TIME|>", true).start();
    }
}
