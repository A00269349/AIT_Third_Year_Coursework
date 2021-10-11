import java.rmi.*;

public interface HouseInterface extends Remote {
    public String getOwner() throws RemoteException;

    public String getAddress() throws RemoteException;
}
