import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in); //Variable global

    /**
     * Muestra la bienvenida al programa
     * @return String, bienvenida
     */
    public static String bienvenida(){
        return "----------------------------------------\n" +
                "       ATM CAJERO AUTOMÁTICO\n" +
                "---------------------------------------";
    }

    /**
     * Método muestra el menú principal del programa
     * @param opcion Opción a la que accedemos.
     * @return numero al que pertenece la opción.
     */

    public int menuPrincipal(int opcion){
        switch(opcion){
            case 0://Acceso usuario

                break;
            case 1://Consultar cuenta
                break;
            case 2://Depositar dinero
                break;
            case 3://Retirar dinero
                break;
            case 4://Otros movimientos
                break;
            case 5://Cerrar sesión
                break;
            default:
                System.out.println("Opción no valida (0-5)");
        }
    }


    public static void main(String[] args) {
        System.out.println(bienvenida());
    }
}