import java.rmi.*;
import java.rmi.server.*;

public class AddImp extends UnicastRemoteObject implements Add {
    public AddImp() throws RemoteException {
        super();
    }

    public int addNum(int x, int y) {
        return x + y;
    }
}
