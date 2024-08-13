package labProject;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GFG1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address1 = InetAddress.getLocalHost();
        System.out.println("InetAddress of Local Host: " + address1);
        InetAddress address2 = InetAddress.getByName("45.22.30.39");
        System.out.println("InetAddress of Named Host: " + address2);
        InetAddress address3[] = InetAddress.getAllByName("172.19.25.29");
        for (int i = 0; i < address3.length; i++) {
            System.out.println("InetAddress of All Named Host: " + address3[i]);
        }
        byte IPAddress[] = {125, 0, 0, 1};
        InetAddress address4 = InetAddress.getByAddress(IPAddress);
        System.out.println("InetAddress of Host with specified IP Address: " + address4);
        byte IPAddress1[] = {105, 22, (byte) 223, (byte) 186};
        InetAddress address5 = InetAddress.getByAddress("gfg.com", IPAddress1);
        System.out.println("InetAddress of Host with specified IP Address: " + address5);
    }
}
