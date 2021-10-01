public class SingletonExample {
    private static SingletonExample myInstance = null;

    private SingletonExample() {System.out.println("CONSTRUCTOR HAS BEEN CALLED");}

    public static SingletonExample GetMyInstance() {
        if (myInstance == null) {
            System.out.println("SINGLETON DOES NOT EXISTS - CREATING IT NOW");
            myInstance = new SingletonExample();
            return myInstance;
        } else {
            System.out.println("SINGLETON ALREADY EXISTS - RETURNING IT");
            return myInstance;
        }
    }
}