package labProject;

import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPPortScanner {

    public static void main(String[] args) {
        int startPort = 1;
        int endPort = 65535;

        System.out.println("Scanning UDP ports from " + startPort + " to " + endPort + "...");

        for (int port = startPort; port <= endPort; port++) {
            if (isPortAvailable(port)) {
                System.out.println("Port " + port + " is available.");
            }
        }
    }

    private static boolean isPortAvailable(int port) {
        try (DatagramSocket socket = new DatagramSocket(port)) {
            return true;
        } catch (SocketException e) {
            return false;
        }
    }
}
