package Assignment_3;

import java.rmi.Naming;
import java.util.ArrayList;
import java.util.Arrays;

public class CarClient {
    public CarClient() {
        StartClient();
    }
    public static void StartClient() {
        String url = "rmi:///";
        System.out.println("CLIENT HAS STARTED");
        try {
            CarListsInterface carList = (CarListsInterface) Naming.lookup( "cars");
            ArrayList<Car> actualCarList = carList.getList();
            for(CarInterface cars : actualCarList) {
                System.out.println(Arrays.toString(cars.getData()));
            }
        }catch (Exception e) {e.printStackTrace();}
    }
}
