import java.io.IOException;
import java.nio.ByteBuffer;

public class BufferDemo {
    public static void main(String[] args) throws IOException {
        // Create a buffer with capacity of 1024 bytes
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        // Fill the buffer with some data
        String data = "This is a test string.";
        buffer.clear();
        buffer.put(data.getBytes());
        buffer.flip(); //switch from writing mode to reading mode

        System.out.println("Buffer after filling:");
        while (buffer.hasRemaining()) {
            System.out.print((char) buffer.get());
        }
        System.out.println();

        // Draining the buffer
        buffer.clear();
        System.out.println("Buffer after draining:");
        while (buffer.hasRemaining()) {
            System.out.print((char) buffer.get());
        }
    }
}
