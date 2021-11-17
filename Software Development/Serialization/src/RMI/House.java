package RMI;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class House extends UnicastRemoteObject implements HouseInterface{

	private String owners;
	private String address;
	
	public House(String o, String a) throws RemoteException{
		this.owners=o;
		this.address=a;
	}
	
	public String getOwners() {
		return this.owners;
	}
	
	public String getAddress() {
		return this.address;
	}
}
