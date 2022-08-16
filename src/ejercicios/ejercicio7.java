package ejercicios;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ejercicio7 {
    static class Punto{

        private double x;
        private double y;
        private double mediox;
        private double medioy;

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

    }

    public static double distancia(Punto punto1, Punto punto2){
        return sqrt(pow((punto2.y-punto1.y),2)+pow((punto2.x-punto1.x),2));
    }
    public static double slope(Punto punto1, Punto punto2){
        return  (punto2.getY()- punto1.getY())/(punto2.getX()-punto1.getX());
    }
    public static double medioX(Punto punto1, Punto punto2){
        return (punto1.getX() + punto2.getX())/2;
    }
    public static double medioY(Punto punto1, Punto punto2){
        return (punto1.getY() + punto2.getY())/2;
    }
    public static void main(String[] args){
        Punto punto1 = new Punto();
        Punto punto2 = new Punto();

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el valor de x1: ");
        punto1.setX(scan.nextDouble());
        System.out.println("Ingrese el valor de y1: ");
        punto1.setY(scan.nextDouble());
        System.out.println("Ingrese el valor de x2 ");
        punto2.setX(scan.nextDouble());
        System.out.println("Ingrese el valor de y2: ");
        punto2.setY(scan.nextDouble());

        System.out.println("La distancia entre puntos es: " + distancia(punto1,punto2));
        System.out.println("La pendiente entre puntos es: " + slope(punto1,punto2));
        System.out.println("El punto medio x es: " + medioX(punto1,punto2));
        System.out.println("El punto medio y es: " + medioY(punto1,punto2));



    }
}
