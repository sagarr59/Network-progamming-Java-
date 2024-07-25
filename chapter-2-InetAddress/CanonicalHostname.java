//Java program that finds the canonical hostname of the given address
import java.net.*;
public class CanonicalHostname {
    public static void main(String[] args) {
     try {
            InetAddress address = InetAddress.getByName("93.184.216.34");
            String canonicalHostname = address.getCanonicalHostName();
            System.out.println("Canonical Hostname: " + canonicalHostname);
        } catch (UnknownHostException e) {
            System.out.println("Unknown host: "+e );
        }
    }
}
