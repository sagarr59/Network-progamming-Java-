//Java program for finding the address of the local machine
import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalMachineIPAddress {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local IP Address: " + localHost.getHostAddress());
            System.out.println("Local Hostname: " + localHost.getHostName());
        } catch (UnknownHostException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
