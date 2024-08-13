package labProject;

import java.io.IOException;
import java.net.InetAddress;

public class Main1 {
    public static void main(String[] args) {
        printAddressDetails("www.instagram.com");
        printAddressDetails(null);
        printAddressDetails("::1");
    }

    private static void printAddressDetails(String host) {
        System.out.println("Host Name: " + host);
        try {
            InetAddress addr = InetAddress.getByName(host);
            System.out.println("Host IP Address: " + addr.getHostAddress());
            System.out.println("Canonical Host Name: " + addr.getCanonicalHostName());
            int timeOutInMillis = 1000;
            System.out.println("isReachable(): " + addr.isReachable(timeOutInMillis));
            System.out.println("isLoopbackAddress(): " + addr.isLoopbackAddress());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("----------\n");
        }
    }
}
