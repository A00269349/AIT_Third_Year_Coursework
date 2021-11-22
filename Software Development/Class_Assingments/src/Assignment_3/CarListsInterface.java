package Assignment_3;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface CarListsInterface extends Remote
{
    public void addToList(Car h) throws RemoteException;
    public void removeFromList(Car h) throws RemoteException;
    public void setList(Car h, int i) throws RemoteException;
    public ArrayList<Car> getList() throws RemoteException;
}
