import java.io.*;
import java.net.*;

public class GetRequest {
    public static void main(String[] args) {
        
        String urlString = "https://api.github.com"; // GitHub API

        try {
            // Create URL object
            @SuppressWarnings("deprecation")
            URL url = new URL(urlString);
            // Open connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            // Read response
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
        } catch (Exception e) {
           System.err.println(e);
        }
    }
}
