import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in); //Variable global

    public static String bienvenida(){
        return "----------------------------------------\n" +
                "       ATM CAJERO AUTOMÁTICO\n" +
                "---------------------------------------";
    }

    public static void main(String[] args) {
        System.out.println(bienvenida());
    }
}