package IOPractise.BIO;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer2 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8001);
            while (true) {
                Socket s = ss.accept();
                System.out.println("来了一个client");
                new Thread(new Worker(s)).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
