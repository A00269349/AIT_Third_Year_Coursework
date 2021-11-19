package Assignment_3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CarInterface extends Remote {
    public int getID() throws RemoteException;
}
