import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class WorkerThread extends Thread {
    Socket socket;

    WorkerThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            InputStream in = socket.getInputStream();
            Scanner r = new Scanner(in);
            OutputStream o = socket.getOutputStream();
            PrintWriter p = new PrintWriter(o);

            String file_name;
            file_name = r.nextLine();
            System.out.println(getName() + " HANDLING: " + file_name);

            FileInputStream f_in = new FileInputStream(file_name);
            Scanner f = new Scanner(f_in);

            String line;
            while (f.hasNextLine()) {
                line = f.nextLine();
                p.println(line);
            }
            sleep(1500);
            p.close();
            System.out.println(getName() + " FINISHED HANDLING: " + file_name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}