import java.rmi.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 num:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Add a1 = (Add) Naming.lookup("rmi://localhost/Add");
        System.out.println("Sum= " + a1.addNum(x, y));
    }
}
