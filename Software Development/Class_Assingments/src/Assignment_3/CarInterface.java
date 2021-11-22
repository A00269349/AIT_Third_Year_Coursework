package Assignment_3;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CarInterface extends Remote
{
    public String getMake() throws RemoteException;
    public String getSeries() throws RemoteException;
    public String getCountry() throws RemoteException;
    public String getPower_type() throws RemoteException;
    public int getId() throws RemoteException;
    public int getYear() throws RemoteException;
    public int getDoors() throws RemoteException;
    public String[] getData() throws RemoteException;
}
