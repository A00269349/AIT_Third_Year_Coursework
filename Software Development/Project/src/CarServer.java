import java.io.*;
import java.rmi.Naming;
import java.util.ArrayList;

public class CarServer {
    public CarServer() throws IOException, ClassNotFoundException {
        StartServer();
    }

    public static void StartServer() throws IOException, ClassNotFoundException {
        System.out.println("SERVER HAS STARTED");
        CarLists cars = new CarLists();
        try {
            // DESERIALIZE
            FileInputStream fileIn = new FileInputStream("CarsSet.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            cars = (CarLists) objectIn.readObject();

            ArrayList<Car> cars_arraylist = cars.getList();
            for (Car car : cars_arraylist) {
                cars.addToList(car);
            }

            objectIn.close();
            Naming.rebind("CARLIST", cars);
        } catch (Exception e) {
            cars.addToList(new Car(0, "null", "null ", "null ", " null", 2002, 13));

            FileOutputStream fileOut = new FileOutputStream("CarsSet.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(cars);
            objectOut.close();

            ArrayList<Car> cars_arraylist = cars.getList();
            for (Car name : cars_arraylist) {
                System.out.println(name);
            }

            FileInputStream fileIn = new FileInputStream("CarsSet.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            cars = (CarLists) objectIn.readObject();
            objectIn.close();
            Naming.rebind("DeserializedCars", cars);
        }
        System.out.println("SERVER HAS ENDED");
    }
}
