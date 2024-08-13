import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) {
        String serverAddress = "localhost"; // Address of the server
        int port = 12345; // Port of the server

        try (Socket socket = new Socket(serverAddress, port);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to server");

            String message;
            while (true) {
                System.out.print("Enter message: ");
                message = userInput.readLine(); // Read user input
                if (message.equalsIgnoreCase("exit")) {
                    break; // Exit loop if user types "exit"
                }

                out.println(message); // Send message to server
                String response = in.readLine(); // Read response from server
                System.out.println("Server replied: " + response);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
