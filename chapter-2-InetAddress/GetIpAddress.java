import java.net.*;

public class GetIpAddress {

    public static void main(String[] args) {
        // Example web address to test
        String hostname = "www.github.com";

        try {
            // Getting all IP addresses for the given hostname
            InetAddress[] addresses = InetAddress.getAllByName(hostname);

            System.out.println("IP addresses for " + hostname + ":");

            // Iterating through the addresses and printing them
            for (InetAddress address : addresses) {
                if (address instanceof Inet6Address) {
                    // IPv6 address
                    System.out.println("IPv6 Address: " + address.getHostAddress());
                } else if (address instanceof Inet4Address) {
                    // IPv4 address
                    System.out.println("IPv4 Address: " + address.getHostAddress());
                }
            }

        } catch (UnknownHostException e) {
            // Handling unknown host exception
            System.err.println("Error: " + e.getMessage());
        }
    }
}
