package labProject;

import java.net.*;
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address1 = InetAddress.getByName("45.22.50.39");
        InetAddress address2 = InetAddress.getByName("45.22.50.59");
        InetAddress address3 = InetAddress.getByName("172.19.25.29");
        System.out.println("Is Address 1 equals to Address 2? " + address1.equals(address2));
        System.out.println("Is Address 1 equals to Address 3? " + address1.equals(address3));
        System.out.println("IP Address: " + address1.getHostAddress());
        System.out.println("Hostname for this IP Address: " + address1.getHostName());
        System.out.println("IP Address in bytes: " + address1.getAddress());
        System.out.println("isMulticastAddress? " + address1.isMulticastAddress());
        System.out.println("Address in String Form: " + address1.toString());
        System.out.println("Canonical HostName: " + address1.getCanonicalHostName());
        System.out.println("Hash Code: " + address1.hashCode());
        System.out.println("Unpredictable Address? " + address1.isAnyLocalAddress());
    }
}
