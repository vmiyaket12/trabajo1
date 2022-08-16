package ejercicios;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class ejercicio5 {
    static class Circulo{
        private double radio;
        private double area;

        public Circulo(double radio) {
            this.radio = radio;
            this.area = PI*pow(radio,2);
        }
    }


    public static double corona(Circulo circulo1, Circulo circulo2){
        return circulo1.area - circulo2.area;
    }


    public static void main(String[] args){
        double x,y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo grande");
        x = scan.nextDouble();

        System.out.println("Ingrese el radio del circulo pequeno");
        y = scan.nextDouble();

        Circulo circleGrande = new Circulo(x);
        Circulo circlePeque = new Circulo(y);

        System.out.println("El valor del area de la corona es: "+ corona(circleGrande,circlePeque)+" u^2");
    }

}
