import java.rmi.Naming;
import java.util.ArrayList;
import java.util.Arrays;

public class CarClient
{
    public static void main(String[] args) {
        System.out.println("CLIENT HAS STARTED");
        try {
            CarListsInterface carList = (CarListsInterface) Naming.lookup("DeserializedCars");

            ArrayList<Car> cars = new ArrayList<>();//=  carList.getList();

            for (CarInterface car : carList.getList()) {
                cars.add(new Car(car.getId(), car.getMake(), car.getSeries(), car.getCountry(), car.getPower_type(),car.getYear(),car.getDoors()));
            }

            new A3_Controller_CarDetails(cars, carList);
        }
        catch (Exception e) {e.printStackTrace();}
        System.out.println("CLIENT HAS ENDED");
    }
}
