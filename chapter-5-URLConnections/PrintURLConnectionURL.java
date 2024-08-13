import java.net.*;

public class PrintURLConnectionURL {
    public static void main(String[] args) {
        String urlString = "https://exam.tufohss.edu.np/";  // URL to connect to

        try {
            // Create a URL object
            @SuppressWarnings("deprecation")
            URL url = new URL(urlString);

            // Open a connection to the URL
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            // Print the URL of the connection
            System.out.println("URL of the connection: " + con.getURL());

            // Optional: Print the response code
            System.out.println("Response Code: " + con.getResponseCode());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
