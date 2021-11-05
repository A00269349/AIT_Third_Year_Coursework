import java.net.ServerSocket;
import java.net.Socket;

public class ThreadedFileServerApp {
    public static void main(String[] args) throws Exception {
        System.out.println("SERVER READY");
        ServerSocket server_socket = new ServerSocket(2001);
        while (true) {
            Socket socket = server_socket.accept();
            Thread t = new WorkerThread(socket);
            t.start();
        }
    }
}
