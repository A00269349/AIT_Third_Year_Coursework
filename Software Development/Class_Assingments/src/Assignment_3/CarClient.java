package Assignment_3;

import java.rmi.Naming;

public class CarClient {
    public static void main(String[] args) {
        String url = "rmi:///";
        System.out.println("CLIENT HAS STARTED");
        try {
            CarInterface h1 = (CarInterface) Naming.lookup(url + "BUNGALOW_Car");
            String ownersBung = h1.getOwner();
            System.out.println("RESULT: " + ownersBung);

            CarInterface h2 = (CarInterface) Naming.lookup(url + "DORMER_Car");
            String ownersdorm = h2.getOwner();
            System.out.println("RESULT: " + ownersdorm);
        }catch (Exception e) {e.printStackTrace();}
    }
}
