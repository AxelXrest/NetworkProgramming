package labProject;

import java.io.*;
import java.net.*;

public class Client {
    private Socket socket = null;
    private DataOutputStream out = null;
    private DataInputStream input = null;

    public Client(String address, int port) {
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");
            input = new DataInputStream(System.in);
            out = new DataOutputStream(socket.getOutputStream());
        } catch (IOException io) {
            System.out.println(io);
        }
        String line = " ";
        while (!line.equals("Over")) {
            try {
                line = input.readLine();
                out.writeUTF(line);
            } catch (IOException io) {
                System.out.println(io);
            }
        }
        try {
            input.close();
            out.close();
            socket.close();
        } catch (IOException io) {
            System.out.println(io);
        }
    }

    public static void main(String[] args) {
        Client client = new Client("127.0.0.1", 5000);
    }
}
