import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ConvertidorRemoto extends Remote {

    String mensaje() throws RemoteException;
    double far_celcius(double temperatura) throws RemoteException;
    double celcius_far(double temperatura) throws RemoteException;

}
