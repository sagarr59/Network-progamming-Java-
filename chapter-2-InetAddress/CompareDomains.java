import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.ArrayList;

public class CompareDomains {

    public static void main(String[] args) {
        // Domain names to compare
        String domain1 = "www.ibiblio.org";
        String domain2 = "helios.ibiblio.org";

        try {
            // Resolve IP addresses for both domain names
            List<String> addresses1 = getIpAddresses(domain1);
            List<String> addresses2 = getIpAddresses(domain2);

            // Print the IP addresses
            System.out.println("IP addresses for " + domain1 + ": " + addresses1);
            System.out.println("IP addresses for " + domain2 + ": " + addresses2);

            // Compare the two lists of IP addresses
            if (addresses1.equals(addresses2)) {
                System.out.println("The domain names refer to the same IP addresses.");
            } else {
                System.out.println("The domain names refer to different IP addresses.");
            }

        } catch (UnknownHostException e) {
            // Handling unknown host exception
            System.err.println("Error resolving domain names: " + e.getMessage());
        }
    }

    // Helper method to get IP addresses as a list of strings
    private static List<String> getIpAddresses(String domain) throws UnknownHostException {
        InetAddress[] addresses = InetAddress.getAllByName(domain);
        List<String> ipList = new ArrayList<>();
        for (InetAddress address : addresses) {
            ipList.add(address.getHostAddress());
        }
        return ipList;
    }
}
