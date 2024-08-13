package labProject;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class PortScanner {

    public static void main(String[] args) {
        String host = "localhost";
        int startPort = 1;
        int endPort = 65535;

        for (int port = startPort; port <= endPort; port++) {
            try {
                if (isPortOpen(host, port, 100)) {
                    System.out.println("Port " + port + " is open.");
                }
            } catch (Exception e) {
                System.out.println("Error checking port " + port + ": " + e.getMessage());
            }
        }
    }

    public static boolean isPortOpen(String host, int port, int timeout) {
        try (Socket socket = new Socket()) {
            SocketAddress socketAddress = new InetSocketAddress(host, port);
            socket.connect(socketAddress, timeout);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
