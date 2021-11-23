import java.io.*;
import java.rmi.Naming;
import java.util.ArrayList;

public class CarServer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        StartServer();
    }

    public static void StartServer() throws IOException, ClassNotFoundException {
        System.out.println("SERVER HAS STARTED");
        CarLists cars = new CarLists();
        try {
            System.out.println("IN TRY");
            // DESERIALIZE
            FileInputStream fileIn = new FileInputStream("CarsSet.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            cars = (CarLists) objectIn.readObject();

            ArrayList<Car> cars_arraylist = cars.getList();

            for (Car car : cars_arraylist) {
                System.out.println(car);
            }

            Naming.rebind("DeserializedCars", cars);
            objectIn.close();
        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("IN CATCH");

            for (int i = 0; i < 10; i++) {
                cars.addToList(new Car(0, "N/A", "N/A ", "N/A ", " N/A", 2002, 4));
            }

            FileOutputStream fileOut = new FileOutputStream("CarsSet.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(cars);
            objectOut.close();

            ArrayList<Car> cars_arraylist = cars.getList();
            for (Car car : cars_arraylist) {
                System.out.println(car);
            }

            FileInputStream fileIn = new FileInputStream("CarsSet.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            cars = (CarLists) objectIn.readObject();
            objectIn.close();
            Naming.rebind("DeserializedCars", cars);
        }
        System.out.println("SERVER HAS ENDED");
    }
}
