import java.net.MalformedURLException;
import java.net.URL;

public class UrlParser {
    public static void main(String[] args) {
        String urlString = "https://www.example.com:8080/folder/page.html?search=query#section1";

        try {
            URL url = new URL(urlString);

            System.out.println("Protocol: " + url.getProtocol());     // https
            System.out.println("Domain: " + url.getHost());          // www.example.com
            System.out.println("Port: " + url.getPort());            // 8080
            System.out.println("Path: " + url.getPath());            // /folder/page.html
            System.out.println("Query: " + url.getQuery());          // search=query
            System.out.println("Fragment: " + url.getRef());         // section1

        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        }
    }
}
