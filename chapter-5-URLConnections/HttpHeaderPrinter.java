import java.net.*;

public class HttpHeaderPrinter {
    public static void main(String[] args) {
        try {
            @SuppressWarnings("deprecation")
            URL url = new URL("http://facebook.com");  // Replace with your desired URL
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Get and print headers
            for (int i = 1;; i++) {
                String header = con.getHeaderFieldKey(i);
                if (header == null) break;
                System.out.println(header + ": " + con.getHeaderField(i));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
