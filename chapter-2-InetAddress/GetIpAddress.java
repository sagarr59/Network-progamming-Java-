import java.net.*;

public class GetIpAddress {

    public static void main(String[] args) {
       
        String hostname = "www.github.com";

        try {
            // Getting all IP addresses
            InetAddress[] addresses = InetAddress.getAllByName(hostname);

            System.out.println("IP addresses for " + hostname + ":");

            
            for (InetAddress address : addresses) {
                if (address instanceof Inet6Address) {
                   
                    System.out.println("IPv6 Address: " + address.getHostAddress());
                } else if (address instanceof Inet4Address) {
                   
                    System.out.println("IPv4 Address: " + address.getHostAddress());
                }
            }

        } catch (UnknownHostException e) {
          
            System.err.println("Error: " + e.getMessage());
        }
    }
}
