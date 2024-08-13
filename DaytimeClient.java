package labProject;

import java.net.*;
import java.io.*;

public class DaytimeClient {
    public static void main(String[] args) {
        String hostname = args.length > 0 ? args[0] : "time.nist.gov";
        Socket socket = null;
        try {
            socket = new Socket(hostname, 13);
            socket.setSoTimeout(15000);
            InputStream in = socket.getInputStream();
            StringBuilder time = new StringBuilder();
            InputStreamReader r = new InputStreamReader(in, "ASCII");
            for (int c = r.read(); c != -1; c = r.read()) {
                time.append((char) c);
            }
            System.out.println(time);
        } catch (IOException i) {
            System.err.println(i);
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException i) {
                    System.err.println(i);
                }
            }
        }
    }
}
