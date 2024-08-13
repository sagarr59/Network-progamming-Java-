import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TimeClient {
    private static final String HOSTNAME = "localhost"; // or the IP address of the server
    private static final int PORT = 13;

    public static void main(String[] args) {
        try (Socket socket = new Socket(HOSTNAME, PORT);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            // Read and print the time sent by the server
            String time = reader.readLine();
            System.out.println("Server time: " + time);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
