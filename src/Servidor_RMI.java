import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor_RMI {

    public static void main(String[] args) {
        try {
            // crear una instacnia de la imploemtacion de la interface
            ConvertidorRemoto objetoRemoto = new ConvertidorRemotoImpl();

            // crear registro RMI en un puerto especifico
            Registry registro = LocateRegistry.createRegistry(1099);

            // vincular la implemtacion remota con un nombre especifico
            registro.rebind("ClienteRemoto", objetoRemoto);

            System.out.println("Servidor Iniciado");

        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }

    }

}