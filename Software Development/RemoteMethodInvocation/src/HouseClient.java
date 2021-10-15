import java.rmi.*;
public class HouseClient {
    public static void main(String[] args) {
        String url = "rmi:///";
        System.out.println("CLIENT HAS STARTED");
        try {
            HouseInterface h1 = (HouseInterface) Naming.lookup(url + "BUNGALOW_HOUSE");
            String ownersBung = h1.getOwner();
            System.out.println("RESULT: " + ownersBung);

            HouseInterface h2 = (HouseInterface) Naming.lookup(url + "DORMER_HOUSE");
            String ownersdorm = h2.getOwner();
            System.out.println("RESULT: " + ownersdorm);
        }catch (Exception e) {e.printStackTrace();}
    }
}
