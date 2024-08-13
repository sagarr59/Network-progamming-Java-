import java.rmi.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        AddImp a2 = new AddImp();
        Naming.rebind("rmi://localhost/Add", a2);
    }
}
