package Assignment_3;

import java.io.*;
import java.rmi.Naming;
import java.rmi.Remote;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CarServer
{
    public CarServer() throws IOException, ClassNotFoundException {
        StartServer();
    }
    public static void StartServer() throws IOException, ClassNotFoundException {
        System.out.println("SERVER HAS STARTED");

        CarLists cars = new CarLists();
        ArrayList<Car> cars_arraylist = new ArrayList<>();
        try {
            // DESERIALIZE
            FileInputStream fileIn = new FileInputStream("CarsSet.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            cars_arraylist  = (ArrayList) objectIn.readObject();


            for (Car car : cars_arraylist) {
                cars.addToList(car);
            }

            objectIn.close();
            Naming.rebind("CARLIST", cars);
        }
        catch (Exception e) {
            cars_arraylist.add(new Car(0 , "null", "null ", "null ", " null", 2002, 13));

            FileOutputStream fileOut = new FileOutputStream("CarsSet.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(cars);
            objectOut.close();

            for (Car name : cars_arraylist) {
                System.out.println(name);
            }

            FileInputStream fileIn = new FileInputStream("CarsSet.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            cars_arraylist = (ArrayList<Car>) objectIn.readObject();

            for (Car car : cars_arraylist) {
                cars.addToList(car);
            }

            objectIn.close();
            Naming.rebind("CARLIST",  cars);
        }

        System.out.println("SERVER HAS ENDED");
    }
}
