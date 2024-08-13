import java.io.*;
import java.net.*;

public class WebpageDownloader {
    public static void main(String[] args) {
        try {
            // URL of the webpage to download
            @SuppressWarnings("deprecation")
            URL url = new URL("http://example.com");  // Replace with the desired URL

            // Open connection to the URL
            URLConnection con = url.openConnection();

            BufferedWriter out;
            // Set up output stream to write data to a file
            try ( // Set up input stream to read data from the webpage
                    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                // Set up output stream to write data to a file
                out = new BufferedWriter(new FileWriter("webpage.html"));
                // Read from the input stream and write to the output file
                String line;
                while ((line = in.readLine()) != null) {
                    out.write(line);
                    out.newLine();
                }
                // Close the streams
            }
            out.close();

            System.out.println("Webpage downloaded successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
