import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ConvertidorRemotoImpl extends UnicastRemoteObject implements ConvertidorRemoto {

    protected ConvertidorRemotoImpl() throws RemoteException {
        super();
    }

    @Override
    public String mensaje() throws RemoteException {
        return "--------- Convertidor RMI ---------";
    }

    @Override
    public double far_celcius(double temperatura) throws RemoteException {
        return 5*(temperatura - 32)/9;
    }

    @Override
    public double celcius_far(double temperatura) throws RemoteException {
        return (1.8 * temperatura) + 32;
    }
}
