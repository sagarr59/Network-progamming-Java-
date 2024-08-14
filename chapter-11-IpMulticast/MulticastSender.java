import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MulticastSender {
    public static void main(String[] args) throws Exception {
        final String MULTICAST_ADDRESS = "230.0.0.1";
        final int PORT = 5000;

        // Create a DatagramSocket
        DatagramSocket socket = new DatagramSocket();

        // Prepare the data to send
        String message = "Hello, Multicast!";
        byte[] buffer = message.getBytes();
        InetAddress group = InetAddress.getByName(MULTICAST_ADDRESS);

        // Send the data
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, group, PORT);
        socket.send(packet);

        System.out.println("Message sent to multicast group: " + message);

        socket.close();
    }
}
