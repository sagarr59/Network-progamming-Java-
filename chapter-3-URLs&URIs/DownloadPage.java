import java.io.*;
import java.net.URL;

public class DownloadPage {
    public static void main(String[] args) {
        downloadPage("https://example.com");
    }

    private static void downloadPage(String urlStrin) {
        try {
            @SuppressWarnings("deprecation")
            URL url = new URL(urlString);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
