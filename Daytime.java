package labProject;

import java.net.*;
import java.util.*;
import java.io.*;

public class Daytime {
    private static final String HOSTNAME = "time.nist.gov";

    public static void main(String[] args) throws IOException {
        Date d = Daytime.getDateFromNetwork();
        System.out.println("It is: " + d);
    }

    public static Date getDateFromNetwork() throws IOException {
        long differenceBetweenEpochs = 2208988800L;
        Socket socket = null;
        try {
            socket = new Socket(HOSTNAME, 37);
            socket.setSoTimeout(15000);
            InputStream raw = socket.getInputStream();
            long secondSince1900 = 0;
            for (int i = 0; i < 4; i++) {
                secondSince1900 = (secondSince1900 << 8) | raw.read();
            }
            long secondSince1970 = secondSince1900 - differenceBetweenEpochs;
            long msSince1970 = secondSince1970 * 1000;
            return new Date(msSince1970);
        } finally {
            try {
                if (socket != null)
                    socket.close();
            } catch (IOException i) {
                System.out.println(i);
            }
        }
    }
}

