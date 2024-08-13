package labProject;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetDemo5 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = Inet4Address.getByName("www.javatpoint.com");
        InetAddress ip1[] = InetAddress.getAllByName("www.javatpoint.com");
        byte addr[] = {56, 0, 0, 0};
        System.out.println("IP: " + ip);
        System.out.println("IP1: " + ip1);
        InetAddress ip2 = InetAddress.getByAddress(addr);
        System.out.println("IP2: " + ip2);
        System.out.println("Address: " + Arrays.toString(ip.getAddress()));
        System.out.println("Host Address: " + ip.getHostAddress());
        System.out.println("isAnyLocalAddress: " + ip.isAnyLocalAddress());
        System.out.println("isLinkLocalAddress: " + ip.isAnyLocalAddress());
        System.out.println("isLoopbackAddress: " + ip.isLoopbackAddress());
        System.out.println("isMCGlobal: " + ip.isMCGlobal());
        System.out.println("isMCLinkLocal: " + ip.isMCLinkLocal());
        System.out.println("isMCNodeLocal: " + ip.isMCNodeLocal());
        System.out.println("isMCOrgLocal: " + ip.isMCOrgLocal());
        System.out.println("isMCSiteLocal: " + ip.isMCSiteLocal());
        System.out.println("isMulticastAddress: " + ip.isMulticastAddress());
        System.out.println("isSiteLocalAddress: " + ip.isSiteLocalAddress());
        System.out.println("hashCode: " + ip.hashCode());
        System.out.println("Is ip1 == ip2: " + ip.equals(ip2));
    }
}
