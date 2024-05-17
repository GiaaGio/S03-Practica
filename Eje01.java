package Enunciados;
import java.util.Scanner;
public class Eje01 {
 static double Mtotal, Espacio, Publicidad, Transporte, ServiciosF, Decoracion, GastosV;

    public static void main(String[] args) {
        Mtotal = leeNumero();
        calcularGastos();
        imprimirReporte();
    }

    public static double leeNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese monto total: ");
        Mtotal = scanner.nextDouble();
        return Mtotal;
    }

    public static void calcularGastos() {
        Espacio = Mtotal * 0.23;
        Publicidad = Mtotal * 0.7;
        Transporte = Mtotal * 0.26;
        ServiciosF = Mtotal * 0.12;
        Decoracion = Mtotal * 0.21;
        GastosV = Mtotal * 0.11;
    }

    public static void imprimirReporte() {
        String amarillo = "\033[33m";
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%20s\n", amarillo + "-----------------------------Reporte-----------------------------------");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("El gasto a invertir en el rubro Alquiler de espacio es de: " + Espacio);
        System.out.println("El gasto a invertir en el rubro Publicidad es de: " + Publicidad);
        System.out.println("El gasto a invertir en el rubro Transporte es de: " + Transporte);
        System.out.println("El gasto a invertir en el rubro Servicios feriales es de: " + ServiciosF);
        System.out.println("El gasto a invertir en el rubro Decoración es de: " + Decoracion);
        System.out.println("El gasto a invertir en el rubro Gastos varios es de: " + GastosV);
        System.out.println("-----------------------------------------------------------------------");
    }
}


