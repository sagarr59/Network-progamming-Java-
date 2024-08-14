import java.rmi.*;

public interface Add extends Remote {
    public int addNum(int x, int y) throws RemoteException;
}