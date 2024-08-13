package labProject;

import java.util.Random;

public class RandomPortSelector {

    public static void main(String[] args) {
        int minPort = 49152;
        int maxPort = 65535;

        int randomPort = getRandomPort(minPort, maxPort);
        System.out.println("Selected random port: " + randomPort);
    }

    public static int getRandomPort(int minPort, int maxPort) {
        Random random = new Random();
        return random.nextInt((maxPort - minPort) + 1) + minPort;
    }
}
