import java.net.*;

public class RelativeUri {
    public static void main(String[] args) throws URISyntaxException {
        URI baseUri = new URI("http://www.google.com/");
        URI relativeUri = new URI("images/logo.png");
        
        // Resolve the relative URI against the base URI
        URI resolvedUri = baseUri.resolve(relativeUri);
        System.out.println("Base URI: " + baseUri);
        System.out.println("Relative URI: " + relativeUri);
        System.out.println("Resolved URI: " + resolvedUri);
        
        // Relativize the resolved URI against the base URI
        URI relativizedUri = baseUri.relativize(resolvedUri);
        System.out.println("Relativized URI: " + relativizedUri);
    }
}
