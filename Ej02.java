package Enunciados;
import java.util.Scanner;
public class Ej02 {
static double HR, DAV, JA, JO, DAN, AN;

    public static void main(String[] args) {
        HR = leeNumero();
        calcularHerencias();
        imprimirReporte();
    }

    public static double leeNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese herencia total: ");
        HR = scanner.nextDouble();
        return HR;
    }

    public static void calcularHerencias() {   
        JO = 0.27 * HR;
        JA = 0.85 * JO;
        DAN = 0.25 * HR;
        AN = 0.23 * (JO+DAN);
        DAV = HR - JA - JO - DAN - AN;
    }

    public static void imprimirReporte() {
        String amarillo = "\033[33m";
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%20s\n", amarillo + "-----------------------------Reporte-----------------------------------");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("La cantidad de herencia de Jacinto es:  " + JA);
        System.out.println("La cantidad de herencia de José es:  " + JO);
        System.out.println("La cantidad de herencia de Daniel es:  " + DAN);
        System.out.println("La cantidad de herencia de Antonio es:  " + AN);
        System.out.println("La cantidad de herencia de David es:  " + DAV);
        System.out.println("---------------------------------------------");
    }
}