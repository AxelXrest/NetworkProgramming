package labProject;

import java.net.URL;

public class Url {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.javatpoint.com/80/java_tuto");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("HostName: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name: " + url.getFile());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
