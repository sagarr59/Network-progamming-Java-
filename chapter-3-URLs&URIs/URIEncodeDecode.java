//--PRACTICE--

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URIEncodeDecode {
    public static void main(String[] args) {
        try {
           
            String original = "Hello Sagar!";

            // Encoding the string
            String encoded = URLEncoder.encode(original, "UTF-8");
            System.out.println("Encoded String: " + encoded);
          
            // Decoding the string
            String decoded = URLDecoder.decode(encoded, "UTF-8");
            System.out.println("Decoded String: " + decoded);
        
        } catch (UnsupportedEncodingException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
