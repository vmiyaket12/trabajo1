package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
    public static double valorFuncion(double x, double y){
        double z = 2*x*y;
        x = Math.pow(x,2);
        y = Math.pow(y,2);
        return (z + y + x);
    }

    public static void main(String[] args){
        double x, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese valor de X");
        x = scan.nextDouble();
        System.out.println("Ingrese valor de Y");
        y = scan.nextDouble();


        System.out.println("El resultado de la funcion es: " + valorFuncion(x,y));
    }
}
