import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class CarLists extends UnicastRemoteObject implements CarListsInterface, Serializable
{
    public  ArrayList<Car> cars;

    public CarLists() throws RemoteException {
        cars = new ArrayList();
        // TODO Auto-generated constructor stub
    }
    public void addToList(Car h) throws RemoteException {
        cars.add(h);
    }
    public void removeFromList(int h) throws RemoteException {
        cars.remove(cars.get(h));
    }
    public void setList(Car h, int i) throws RemoteException {
        cars.set(i, h);
    }
    public int getListSize() throws RemoteException {return cars.size();}
    public Car getIndex(int i) throws RemoteException {return cars.get(i);}
    public ArrayList<Car> getList() throws RemoteException {
        return cars;
    }
}
