import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class CarLists extends UnicastRemoteObject implements CarListsInterface
{
    private static ArrayList<Car> cars;

    public CarLists() throws RemoteException {
        cars = new ArrayList();
        // TODO Auto-generated constructor stub
    }
    public void addToList(Car h) throws RemoteException {
        cars.add(h);
    }
    public void removeFromList(Car h) throws RemoteException {
        cars.remove(h);
    }
    public void setList(Car h, int i) throws RemoteException {
        cars.set(i,h);
    }
    public ArrayList<Car> getList() throws RemoteException {
        return cars;
    }
}
