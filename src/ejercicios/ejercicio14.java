package ejercicios;

import java.util.Scanner;

public class ejercicio14 {

    static class Hermano{
        private int edad;
        private String nombre;
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
    public static String getMaxEdad(Hermano hermano1, Hermano hermano2, Hermano hermano3){
        String maxEdad = "";
        if(hermano1.getEdad() > hermano2.getEdad() && hermano1.getEdad() > hermano3.getEdad()){
            maxEdad = hermano1.getNombre();
        }
        if(hermano2.getEdad() > hermano1.getEdad() && hermano2.getEdad() > hermano3.getEdad()){
            maxEdad = hermano2.getNombre();
        }
        if(hermano3.getEdad() > hermano1.getEdad() && hermano3.getEdad() > hermano2.getEdad()){
            maxEdad = hermano3.getNombre();
        }
        return maxEdad;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Hermano hermano1 = new Hermano();
        Hermano hermano2 = new Hermano();
        Hermano hermano3 = new Hermano();
        System.out.println("Ingrese el nombre del hermano 1");
        hermano1.setNombre((scan.next()));
        System.out.println("Ingrese la edad del hermano 1");
        hermano1.setEdad(scan.nextInt());
        System.out.println("Ingrese el nombre del hermano 2");
        hermano2.setNombre((scan.next()));
        System.out.println("Ingrese la edad del hermano 2");
        hermano2.setEdad(scan.nextInt());
        System.out.println("Ingrese el nombre del hermano 2");
        hermano3.setNombre((scan.next()));
        System.out.println("Ingrese la edad del hermano 2");
        hermano3.setEdad(scan.nextInt());

        System.out.println("El hermano mayor es: " + getMaxEdad(hermano1,hermano2,hermano3));
    }
}
