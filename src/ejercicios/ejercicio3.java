package ejercicios;

import java.util.Scanner;

import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

public class ejercicio3 {
    public static double calcularLongitud(double altura, double angulo){
        double longitud;
        double calcAngulo = sin(toRadians(angulo));
        longitud = altura/calcAngulo;
        return longitud;
    }

    public static void main(String[] args){
        double x, y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        x = scan.nextDouble();
        System.out.println("Ingrese el angulo que la escalera esta inclinada");
        y = scan.nextDouble();
        System.out.println("La longitud de la escalera que se necesita es: " + calcularLongitud(x,y));
    }

}
