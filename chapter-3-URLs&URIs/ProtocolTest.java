import java.net.MalformedURLException;
import java.net.URL;

public class ProtocolTest {
    public static void main(String[] args) {
        // List of protocols to test
        String[] urls = {
            "http://google.com",
            "https://google.com",
            "ftp://google.com",
            "file:///C:/Users/Public/Documents/",
            "mailto:example@example.com"
        };

        for (String url : urls) {
            testProtocol(url);
        }
    }

    static void testProtocol(String url) {
        try {
            // Attempt to create a URL object
            @SuppressWarnings("deprecation")
            URL u = new URL(url);
            System.out.println(u.getProtocol() + " is supported");
        } catch (MalformedURLException ex) {
            // If an exception is thrown, the protocol is not supported
            String protocol = url.substring(0, url.indexOf(":"));
            System.out.println(protocol + " is not supported");
        }
    }
}
