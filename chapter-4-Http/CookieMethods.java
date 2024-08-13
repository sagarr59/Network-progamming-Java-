import java.net.*;
import java.util.List;

public class CookieMethods {

    public static void main(String[] args) {
        // Create a CookieManager and get the CookieStore
        CookieManager mgr = new CookieManager();
        CookieStore store = mgr.getCookieStore();

        // Define a URI for the cookies
        URI site = URI.create("http://example.com");

        // 1. Adding a cookie
        HttpCookie userCookie = new HttpCookie("user", "Sagar");
        store.add(site, userCookie);
        System.out.println("Added cookie: " + userCookie);

        // 2. Reading cookies
        List<HttpCookie> cookies = store.get(site);
        System.out.println("Cookies for " + site + ":");
        for (HttpCookie c : cookies) {
            System.out.println("- " + c.getName() + ": " + c.getValue());
        }

        // 3. Deleting a cookie
        store.remove(site, userCookie);
        System.out.println("Deleted cookie: " + userCookie.getName());

        // Verifying deletion
        cookies = store.get(site);
        System.out.println("Cookies after deletion for " + site + ":");
        if (cookies.isEmpty()) {
            System.out.println("- No cookies found.");
        } else {
            for (HttpCookie c : cookies) {
                System.out.println("- " + c.getName() + ": " + c.getValue());
            }
        }
    }
}
