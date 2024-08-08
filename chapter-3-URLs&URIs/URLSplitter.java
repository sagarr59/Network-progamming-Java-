import java.net.URI;
import java.net.URISyntaxException;

public class URLSplitter {
    public static void main(String[] args) {
        try {
            
            String urlString = "https://www.google.com/search?q=java+programming&hl=en#result";
            URI uri = new URI(urlString);

            // Splitting the URL into parts
            String protocol = uri.getScheme();
            String host = uri.getHost();
            int port = uri.getPort(); // returns -1 if the port is not set in the URL
            String path = uri.getPath();
            String query = uri.getQuery(); // returns null if no query is set in the URL
            String fragment = uri.getFragment(); // returns null if no fragment is set in the URL

            // Displaying the parts of the URL
            System.out.println("URL: " + urlString);
            System.out.println("Protocol: " + protocol);
            System.out.println("Host: " + host);
            System.out.println("Port: " + (port == -1 ? "default" : port));
            System.out.println("Path: " + path);
            System.out.println("Query: " + (query == null ? "none" : query));
            System.out.println("Fragment: " + (fragment == null ? "none" : fragment));

        } catch (URISyntaxException e) {
            System.err.println("Invalid URL: " + e.getMessage());
        }
    }
}
