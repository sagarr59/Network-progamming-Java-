import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) {
        int port = 12345; // Port to listen on

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Echo server started on port " + port);

            while (true) {
                // Accept incoming client connection
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected");

                // Create input and output streams
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                String message;
                // Read message from client and send it back
                while ((message = in.readLine()) != null) {
                    System.out.println("Received from client: " + message);
                    out.println(message); // Echo message back to client
                }

                // Close the connection
                in.close();
                out.close();
                clientSocket.close();
                System.out.println("Client disconnected");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
