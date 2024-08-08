// Java program to demonstrate the x-www-form-urlencoded strings
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLEncodedDemo {
    public static void main(String[] args) {
        // Example data
        String originalString = "name=Sagar Raut&age=22&city=Kathmandu";
        
        try {
            // Encode the string
            String encodedString = URLEncoder.encode(originalString, StandardCharsets.UTF_8.toString());
            System.out.println("Encoded String: " + encodedString);
            
            // Decode the string
            String decodedString = URLDecoder.decode(encodedString, StandardCharsets.UTF_8.toString());
            System.out.println("Decoded String: " + decodedString);
            
        } catch (UnsupportedEncodingException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
