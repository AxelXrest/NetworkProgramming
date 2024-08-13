package labProject;

import java.net.InetAddress;

public class InetAddressMethod {
    public static void main(String[] args) {
        try {
            InetAddress ip1 = InetAddress.getByName("www.instagram.com");
            System.out.println("HostName 1: " + ip1.getHostName());
            InetAddress ip2 = InetAddress.getByName("www.instagram.com");
            System.out.println("HostName 2: " + ip2.getHostName());
            if (ip1.equals(ip2)) {
                System.out.println("Both are equal.");
            } else {
                System.out.println("They are not equal.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
