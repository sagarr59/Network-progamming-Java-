import java.io.*;
import java.net.*;

public class HttpRequestMethods {
    public static void main(String[] args) {
        String urlString = "https://httpbin.org/anything";  
        try {
            // Perform a GET request
            System.out.println("GET:");
            performRequest(urlString, "GET", null);
            
            // Perform a POST request
            System.out.println("\nPOST:");
            String postData = "key1=value1&key2=value2";  // Example POST data
            performRequest(urlString, "POST", postData);
            
            // Perform a PUT request
            System.out.println("\nPUT:");
            String putData = "key1=value1&key2=value2";  // Example PUT data
            performRequest(urlString, "PUT", putData);
            
            // Perform a DELETE request
            System.out.println("\nDELETE:");
            performRequest(urlString, "DELETE", null);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void performRequest(String urlString, String method, String data) {
        try {
            @SuppressWarnings("deprecation")
            URL url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod(method);

            if (data != null && (method.equals("POST") || method.equals("PUT"))) {
                con.setDoOutput(true);
                try (OutputStream os = con.getOutputStream()) {
                    os.write(data.getBytes());
                    os.flush();
                }
            }

            // Print only the response code
            System.out.println("Response Code: " + con.getResponseCode());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
