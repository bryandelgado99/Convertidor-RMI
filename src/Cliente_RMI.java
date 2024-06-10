import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Cliente_RMI {

    public static void main(String[] args) {

        // Obtener el registro
        Registry registro;
        Scanner input = new Scanner(System.in);

        try {
            registro = LocateRegistry.getRegistry("localhost", 1099);

            // crear instacia de la implemetacion de la interfaz
            ConvertidorRemoto objetoRemoto = (ConvertidorRemoto) registro.lookup("ClienteRemoto");

            while(true) {

                System.out.println("\n----------------------------------------------------------");
                String mensaje = objetoRemoto.mensaje();
                System.out.println(mensaje);

                System.out.println("Ingrese su cantidad de temperatura (con decimales, separados por coma): ");
                double temperature = input.nextDouble();
                System.out.println("----------------------------------------------------------");


                System.out.println("Seleccione su mecanismo de conversión:");
                System.out.println("1. Farenheit a Celcius");
                System.out.println("2. Celcius a Farenheit");
                System.out.println("\n----------------------------------------------------------");
                int seleccion = input.nextInt();

                switch (seleccion) {
                    case 1:
                        double respuesta_a = objetoRemoto.far_celcius(temperature);
                        System.out.println("La medida de " + temperature + "°F" + " equivale a " + respuesta_a +"°C.");
                        TimeUnit.SECONDS.sleep(10);

                        break;

                    case 2:
                        double respuesta_b = objetoRemoto.celcius_far(temperature);
                        System.out.println("La medida de " + temperature + "°C" + " equivale a " + respuesta_b +"°F.");
                        TimeUnit.SECONDS.sleep(10);

                        break;
                    default:
                        System.out.println("No existe dicha opción, intente nuevamente...");
                        break;
                }
            }


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
