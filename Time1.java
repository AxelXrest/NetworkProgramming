package labProject;

import java.io.IOException;
import java.net.*;

public class Time1 {
    public static void main(String[] args) {
        String host = args.length > 0 ? args[0] : "localhost";
        boolean serverFound = false;

        for (int i = 1; i < 1024; i++) {
            try (Socket s = new Socket(host, i)) {
                System.out.println("There is a server on port " + i + " of " + host);
                serverFound = true;
            } catch (UnknownHostException uh) {
                System.err.println(uh);
                break;
            } catch (IOException io) {
            }
        }

        if (!serverFound) {
            System.out.println("No servers found on ports 1 to 1023 of " + host);
        }
    }
}
