import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTypeChecker {

    public static void main(String[] args) {
        
        String ip = "192.168.1.1"; // Example IPv4 address
        // String ip = "2001:0db8:85a3:0000:0000:8a2e:0370:7334"; //  IPv6 address
        
        try {
            InetAddress inetAddress = InetAddress.getByName(ip);
            byte[] addr = inetAddress.getAddress();
            
            if (addr.length == 4) {
                System.out.println("The IP address " + ip + " is IPv4.");
            } else if (addr.length == 16) {
                System.out.println("The IP address " + ip + " is IPv6.");
            } else {
                System.out.println("Unknown IP type.");
            }
        } catch (UnknownHostException e) {
            System.out.println("Invalid IP address.");
        }
    }
}
