import javax.net.ssl.*;
import java.io.*;

public class SecureClient {
    public static void main(String[] args) {
        try {
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket socket = (SSLSocket) factory.createSocket("tufohss.edu.np", 443);
            
            socket.setEnabledCipherSuites(socket.getSupportedCipherSuites());

            OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream(), "US-ASCII");
            out.write("GET / HTTP/1.1\r\nHost: tufohss.edu.np\r\n\r\n");
            out.flush();

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            while ((line = in.readLine()) != null && !line.isEmpty()) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
