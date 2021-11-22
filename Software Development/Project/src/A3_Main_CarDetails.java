import java.io.IOException;

public class A3_Main_CarDetails {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new CarServer();
        new CarClient();
        new A3_Controller_CarDetails();
    }
}
