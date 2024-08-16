import java.net.*;
import java.rmi.*;

public class Server {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        AddImp a2 = new AddImp();
        Naming.rebind("rmi://localhost/Add", a2);//rebind 
    }
}