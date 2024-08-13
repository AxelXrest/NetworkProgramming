package labProject;

import java.net.URL;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://www.google.com" + "/search?q=javatpoint&oq=javatpoint&sourceid=chrome&ie=UTF-8");
            System.out.println("Protocol: " + u.getProtocol());
            System.out.println("HostName: " + u.getHost());
            System.out.println("Port Number: " + u.getPort());
            System.out.println("Default Port Number: " + u.getDefaultPort());
            System.out.println("Query String: " + u.getQuery());
            System.out.println("Path: " + u.getPath());
            System.out.println("File Name: " + u.getFile());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
