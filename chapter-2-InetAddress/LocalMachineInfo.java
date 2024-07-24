import java.net.*;

public class LocalMachineInfo {

    public static void main(String[] args) {
        try {
            // Getting InetAddress object for the local machine
            InetAddress localHost = InetAddress.getLocalHost();

            // Printing the local machine's IP address
            System.out.println("Local IP Address: " + localHost.getHostAddress());

            // Printing the local machine's name
            System.out.println("Local Host Name: " + localHost.getHostName());

        } catch (UnknownHostException e) {
            // Handling unknown host exception
            System.err.println("Unknown host: " + e.getMessage());
        }
    }
}
