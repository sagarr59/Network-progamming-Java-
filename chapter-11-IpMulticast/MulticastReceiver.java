import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastReceiver {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
        final String MULTICAST_ADDRESS = "230.0.0.1";
        final int PORT = 5000;

        // Create a MulticastSocket
        MulticastSocket socket = new MulticastSocket(PORT);

        // Join the multicast group
        InetAddress group = InetAddress.getByName(MULTICAST_ADDRESS);
        socket.joinGroup(group);

        System.out.println("Receiver is running and waiting for multicast data...");

        while (true) {
            // Prepare to receive data
            byte[] buffer = new byte[256];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);

            // Process the received data
            String received = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received: " + received);
        }
    }
}
