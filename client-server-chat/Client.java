import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {
        System.out.println("Client started...");

        try (Socket socket = new Socket("localhost", 12345);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            String message;

            while (true) {
                // Read and print server messages
                if (in.ready()) {
                    message = in.readLine();
                    if (message == null) break;  // Exit loop if server disconnects
                    System.out.println("Server: " + message);
                }

                // Send user input to server
                if (userInput.ready()) {
                    message = userInput.readLine();
                    if (message != null && !message.trim().isEmpty()) {
                        out.println(message);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
