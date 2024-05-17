package Enunciados;

import java.util.Scanner;

public class Ej03 {

    public static void main(String[] args) {
        float HT, TH, SB, B, SBR, D, SN;
        HT = ingresarDatos1();
        TH = ingresarDatos2();
        SB = calcularSueldoB(HT, TH);
        B = calcularBonificacion(SB);
        SBR = calcularSueldoBruto(SB, B);
        D = calcularDescuento(SBR);
        SN = calcularSueldoNeto(SBR, D);
        imprimirReporte(SB, B, SBR, D, SN);
    }

    static float ingresarDatos1() {
        Scanner teclado = new Scanner(System.in);
        float HT;
        System.out.print("Ingrese las horas de trabajo: ");
        HT = Float.parseFloat(teclado.next());
        return HT;
    }

    static float ingresarDatos2() {
        Scanner teclado = new Scanner(System.in);
        float TH;
        System.out.print("Ingrese la tarifa horaria: ");
        TH = Float.parseFloat(teclado.next());
        return TH;
    }

    static float calcularSueldoB(float HT, float TH) {
        float SB;
        SB = HT * TH;
        return SB;
    }

    static float calcularBonificacion(float SB) {
        float B;
        B = 0.20f * SB;
        return B;
    }

    static float calcularSueldoBruto(float SB, float B) {
        float SBR;
        SBR = SB + B;
        return SBR;
    }

    static float calcularDescuento(float SBR) {
        float D;
        D = 0.10f * SBR;
        return D;
    }

    static float calcularSueldoNeto(float SBR, float D) {
        float SN;
        SN = SBR - D;
        return SN;
    }

    static void imprimirReporte(float SB, float B, float SBR, float D, float SN) {
        String amarillo = "\033[33m";
        System.out.println("--------------------------------");
        System.out.printf("%20s\n", amarillo + "------------Reporte-------------");
        System.out.println("--------------------------------");
        System.out.println("El sueldo básico es:  " + SB);
        System.out.println("La bonificación es:  " + B);
        System.out.println("El sueldo bruto es:  " + SBR);
        System.out.println("El descuento es:  " + D);
        System.out.println("El sueldo neto es:  " + SN);
        System.out.println("--------------------------------");
    }
}
