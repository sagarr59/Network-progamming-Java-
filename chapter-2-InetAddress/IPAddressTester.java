//Java  program for testing the characteristics of an IP address
import java.net.*;
public class IPAddressTester {

    public static void main(String[] args) {
        // Setting example IP address to test (localhost)
        String ipAddress = "127.0.0.1";

        try {
            // Getting InetAddress object for the IP address
            InetAddress inet = InetAddress.getByName(ipAddress);

            // Printing the IP address
            System.out.println("IP Address: " + inet.getHostAddress());
            
            // Checking if the IP address is reachable
            System.out.println("Reachable: " + inet.isReachable(5000)); // Timeout in milliseconds

            // Checking if the IP address is a loopback address
            System.out.println("Loopback Address: " + inet.isLoopbackAddress());

            // Checking if the IP address is a multicast address
            System.out.println("Multicast Address: " + inet.isMulticastAddress());

            // Checking if the IP address is an any-local address
            System.out.println("Any Local Address: " + inet.isAnyLocalAddress());

            // Checking if the IP address is a site-local address
            System.out.println("Site Local Address: " + inet.isSiteLocalAddress());

        } catch (Exception e) {
            // Handling exception
            System.err.println("Error: " + e.getMessage());
        }
    }
}
