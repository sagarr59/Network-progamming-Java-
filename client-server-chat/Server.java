import java.io.*;
import java.net.*;

public class Server {
   

    public static void main(String[] args) {
        System.out.println("Server started...");

        try (ServerSocket server = new ServerSocket(12345);
             Socket client = server.accept();
             BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
             PrintWriter out = new PrintWriter(client.getOutputStream(), true);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Client connected");

            String message;

            while (true) {
                // Read and print client messages
                if (in.ready()) {
                    message = in.readLine();
                    if (message == null) break;  // Exit loop if client disconnects
                    System.out.println("Client: " + message);
                }

                // Send user input to client
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
