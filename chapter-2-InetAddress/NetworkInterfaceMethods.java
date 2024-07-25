//Java program that uses network interfaces' getter methods
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetworkInterfaceMethods {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface netIf = interfaces.nextElement();
                System.out.println("Name: " + netIf.getName());
                System.out.println("Display Name: " + netIf.getDisplayName());
                System.out.println("Up: " + netIf.isUp());
                System.out.println("Is Loopback: " + netIf.isLoopback());
                System.out.println();
            }
        } catch (SocketException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
