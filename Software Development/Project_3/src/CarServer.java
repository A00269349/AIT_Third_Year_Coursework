import java.io.*;
import java.rmi.Naming;
import java.util.ArrayList;

public class CarServer implements Serializable
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("SERVER HAS STARTED");
        try {
            // DESERIALIZE
            FileInputStream fileIn = new FileInputStream("cars.set");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            CarLists carLists = (CarLists) objectIn.readObject();
            ArrayList<Car> cars_arraylist = carLists.getList();
            for (Car car : cars_arraylist) {
                System.out.println("TRY: " + car);
            }
            objectIn.close();
            Naming.rebind("DeserializedCars", carLists);
        }
        catch (Exception e) {
            // SERIALIZE
            e.printStackTrace();
            CarLists cars = new CarLists();
            for (int i = 0; i < 10; i++) {
                cars.addToList(new Car(i, "N/A", "N/A ", "N/A ", " N/A", 2002, 4));
            }
            FileOutputStream fileOut = new FileOutputStream("cars.set");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(cars);
            objectOut.close();

            // DESERIALIZE
            ArrayList<Car> cars_arraylist = cars.getList();
            for (Car car : cars_arraylist) {
                System.out.println("CATCH: " + car);
            }
            FileInputStream fileIn = new FileInputStream("cars.set");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            cars = (CarLists) objectIn.readObject();
            objectIn.close();
            Naming.rebind("DeserializedCars", cars);
        }
        System.out.println("SERVER HAS ENDED");
    }
}
