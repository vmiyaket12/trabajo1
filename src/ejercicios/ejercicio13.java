package ejercicios;

import java.util.Scanner;

public class ejercicio13 {

    public static double aumentoDeSueldo(double sueldo){
        if(sueldo <= 800000){
            sueldo *= .10;
        }else if(sueldo >800000 && sueldo <= 1200000){
            sueldo *= .08;
        }else{
            sueldo *= .05;
        }
        return sueldo;
    }
    public static double nuevoSueldo(double sueldo, double nuevoSueldo){
        return sueldo += nuevoSueldo;
    }
    public static void main(String[] args) {
        double sueldo;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el valor del sueldo actual: ");
        sueldo = scan.nextDouble();
        double aumentoSueldo = aumentoDeSueldo(sueldo);
        double nuevoSueldo = nuevoSueldo(sueldo,aumentoSueldo);
        System.out.println("El aumento va ser de: " + aumentoSueldo);
        System.out.println("El nuevo sueldo es de: " + nuevoSueldo);
    }
}
