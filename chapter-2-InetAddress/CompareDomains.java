//Java program for comparing 2 domain names
import java.net.InetAddress;

public class CompareDomains {
    public static void main(String[] args) {
        try {
           
            InetAddress address1 = InetAddress.getByName("www.facebook.com");
            InetAddress address2 = InetAddress.getByName("facebook.com");

          
            if (address1.equals(address2)) {
                System.out.println("The domain names point to the same IP address.");
            } else {
                System.out.println("The domain names point to different IP addresses.");
            }
        } catch (Exception e) {
            System.err.println("Error:"+e.getMessage());
        }
    }
}
