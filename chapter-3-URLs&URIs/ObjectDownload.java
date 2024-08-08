import java.io.*;
import java.net.URL;

public class ObjectDownload{
	public static void main (String[] args) {
			download("https://google.com");
	}

	@SuppressWarnings("deprecation")
  private static void download(String url) {
		
		try {
			URL u = new URL("http://www.google.com");
			InputStream in = u.openStream();
			int c;
			while ((c = in.read()) != -1) System.out.write(c);
			in.close();
		} catch (IOException ex) {
			System.err.println(ex);
		}

	}
}