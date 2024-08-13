import java.net.*;

public class LastModifiedTime {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com"); 
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Get the last modified time
            long lastModified = con.getLastModified();
            
            // Print the last modified time
            if (lastModified == 0) {
                System.out.println("The URL does not have a Last-Modified header.");
            } else {
                System.out.println("Last-Modified: " + new java.util.Date(lastModified));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
