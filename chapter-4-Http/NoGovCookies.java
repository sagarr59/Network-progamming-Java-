import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URI;

public class NoGovCookies implements CookiePolicy {
    @Override
    public boolean shouldAccept(URI uri, HttpCookie cookie) {
        return !(uri.getAuthority().toLowerCase().endsWith(".gov")
                || cookie.getDomain().toLowerCase().endsWith(".gov"));
    }

    public static void main(String[] args) {
        URI uri = URI.create("http://www.usa.gov");
        HttpCookie cookie = new HttpCookie("session", "12345");
        cookie.setDomain("usa.gov");

        System.out.println("Cookie Domain: " + cookie.getDomain());
        System.out.println(new NoGovCookies().shouldAccept(uri, cookie) ? "Cookie accepted" : "Cookie blocked");
    }
}
