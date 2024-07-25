//Java program to check if a remote system is reachable or not[Testing Reachability]
import java.net.InetAddress;

public class TestReachability {
    public static void main(String[] args) {
        
        String hostname = "www.github.com"; 

        try {
            InetAddress inetAddress = InetAddress.getByName(hostname);
            System.out.println("Testing reachability of " + hostname + " (" + inetAddress.getHostAddress() + ")...");

            // Try to reach the host, with a timeout of 5 seconds (5000 milliseconds)
            if (inetAddress.isReachable(5000)) {
                System.out.println(hostname + " is reachable.");
            } else {
                System.out.println(hostname + " is not reachable.");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
