import java.net.*;

public class HeaderFieldsReader {
    public static void main(String[] args) {
        try {
            @SuppressWarnings("deprecation")
            URL url = new URL("http://google.com");  
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Print all header fields and their values
            for (int i = 1;; i++) {
                String field = con.getHeaderFieldKey(i);
                if (field == null) break;  // No more headers
                System.out.println(field + ": " + con.getHeaderField(i));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
