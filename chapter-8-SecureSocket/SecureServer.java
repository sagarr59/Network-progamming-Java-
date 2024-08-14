import javax.net.ssl.*;
import java.io.*;

public class SecureServer {
    public static void main(String[] args) throws Exception {
        SSLServerSocketFactory factory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        SSLServerSocket serverSocket = (SSLServerSocket) factory.createServerSocket(8443);

        String[] supportedCiphers = serverSocket.getSupportedCipherSuites();
        System.out.println("Supported Cipher Suites:");
        for (String cipher : supportedCiphers) {
            System.out.println(cipher);
        }

        serverSocket.setEnabledCipherSuites(new String[]{ "TLS_AES_128_GCM_SHA256", "TLS_AES_256_GCM_SHA384" });

        System.out.println("\nEnabled Cipher Suites:");
        for (String cipher : serverSocket.getEnabledCipherSuites()) {
            System.out.println(cipher);
        }

        System.out.println("Server started on port 8443");
        try (SSLSocket socket = (SSLSocket) serverSocket.accept()) {
            // Placeholder for actual client communication
        }
        serverSocket.close();
    }
}
