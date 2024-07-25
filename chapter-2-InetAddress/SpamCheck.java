//Java program  demonstrating the SpamCheck
import java.net.InetAddress;
import java.net.UnknownHostException;

public class SpamCheck {
    
    public static final String BLACKLIST = "bl.spamcop.net";

    public static void main(String[] args) {
        
        String[] ipAddresses = { "8.8.8.8", "1.1.1.1", "192.168.1.1" };
        
        for (String ip : ipAddresses) {
            if (isSpam(ip)) {
                System.out.println("Spam found! " + ip);
            } else {
                System.out.println("Spam not found! " + ip);
            }
        }
    }

  public static boolean isSpam(String url) {
    try {
      InetAddress address = InetAddress.getByName(url);
      byte[] ip = address.getAddress();
      String query = BLACKLIST;
      for (byte octet : ip) {
        int unsignedByte = octet < 0 ? octet + 256 : octet;
        query = unsignedByte + "." + query;
      }
      InetAddress.getByName(query);
      return true;
    } catch (UnknownHostException e) {
      return false;
    }
  }

}
