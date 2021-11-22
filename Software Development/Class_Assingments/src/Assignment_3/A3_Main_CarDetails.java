package Assignment_3;
import java.io.IOException;
import java.rmi.RemoteException;
public class A3_Main_CarDetails {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new CarServer();
        new CarClient();
        new A3_Controller_CarDetails();
    }
}
