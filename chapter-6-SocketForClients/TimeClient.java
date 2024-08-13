import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Date;

public class TimeClient {
    private static final String HOSTNAME = "time.nist.gov";

    public static void main(String[] args) {
        try {
            Date d = getDateFromNetwork();
            System.out.println("It is " + d);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static Date getDateFromNetwork() throws IOException {
        long differenceBetweenEpochs = 2208988800L;

        try (Socket socket = new Socket(HOSTNAME, 37)) {
            socket.setSoTimeout(15000);
            InputStream raw = socket.getInputStream();

            long secondsSince1900 = 0;
            for (int i = 0; i < 4; i++) {
                secondsSince1900 = (secondsSince1900 << 8) | raw.read();
            }

            long secondsSince1970 = secondsSince1900 - differenceBetweenEpochs;
            long msSince1970 = secondsSince1970 * 1000;
            return new Date(msSince1970);
        }
    }
}
