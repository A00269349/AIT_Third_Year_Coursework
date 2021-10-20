import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientSide {

    public static void main(String[] args) throws Exception {
        InetAddress inet = InetAddress.getLocalHost();

        Socket s = new Socket(inet, 2001);
        InputStream in = s.getInputStream();
        Scanner r = new Scanner(in);
        OutputStream o = s.getOutputStream();
        PrintWriter p = new PrintWriter(o);

        p.println("testing.txt");
        p.flush();

        String line;
        while (r.hasNextLine()) {
            line = r.nextLine();
            System.out.println(line);
        }
    }
}
