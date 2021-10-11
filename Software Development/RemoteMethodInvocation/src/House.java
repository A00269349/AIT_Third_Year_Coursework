import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class House extends UnicastRemoteObject implements HouseInterface {

    private String owner, address;

    public House(String owner, String address) throws RemoteException {
        this.owner = owner;
        this.address = address;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getAddress() {
        return this.address;
    }
}
