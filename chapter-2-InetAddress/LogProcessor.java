//Java program to process web server log files
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class LogProcessor {
    public static void main(String[] args) {
        String logfile = "webserver.log";
        try (
            // Opening the file input stream
            FileInputStream fin = new FileInputStream(logfile);
            // Creating an input stream reader
            InputStreamReader in = new InputStreamReader(fin);
            // Wrapping the reader with a buffered reader
            BufferedReader bin = new BufferedReader(in);
        ) {
            // Reading each line from the log file
            for (String entry = bin.readLine(); entry != null; entry = bin.readLine()) {
                // Finding the index of the first space to extract the IP address
                int index = entry.indexOf(' ');
                String ip = entry.substring(0, index);
                String theRest = entry.substring(index);
                // Resolving the IP address to a hostname and printing it
                try {
                    InetAddress address = InetAddress.getByName(ip);
                    System.out.println(address.getHostName() + theRest);
                } catch (UnknownHostException ex) {
                    System.err.println(entry);
                }
            }
        } catch (IOException ex) {
            System.out.println("Exception: " + ex);
        }
    }
}
