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



    public static void main(String[] args) {
        System.out.println(bienvenida());
    }
}