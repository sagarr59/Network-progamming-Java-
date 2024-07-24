import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.List;

public class Networ {
    public static void main(String[] args) {
        try {
            // Get all network interfaces and convert to a list
            List<NetworkInterface> networkInterfaces = Collections.list(NetworkInterface.getNetworkInterfaces());

            System.out.println("Network Interfaces:\n");
            for (NetworkInterface netInterface : networkInterfaces) {
                // Print interface name and whether it's up
                System.out.println("Name: " + netInterface.getName() + " | Up: " + netInterface.isUp());
            }
        } catch (SocketException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
