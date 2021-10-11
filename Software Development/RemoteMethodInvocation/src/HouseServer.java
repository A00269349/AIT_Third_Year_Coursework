
import java.rmi.*;
import java.rmi.server.*;

public class HouseServer {
    public static void main(String[] args) {
        System.out.println("SERVER HAS STARTED");
        try {
            House bungalow = new House("SMITHS", "DUBLIN");
            System.out.println("BUNGALOW CREATED");
            House dormer = new House("BURKES", "KERRY");
            System.out.println("DORMER CREATED");
            Naming.rebind("BUNGALOW_HOUSE", bungalow);
            Naming.rebind("DORMER_HOUSE", dormer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
