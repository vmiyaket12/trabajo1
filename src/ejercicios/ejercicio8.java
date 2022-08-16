package ejercicios;

import java.util.Scanner;

import static java.lang.Math.ceil;

public class ejercicio8 {
    static class Edificio {

        private int numSalonPorPiso;
        private int numDePiso;
        private int capacidadPorSalon;
        private int numDeSalones;

        public int getNumSalonPorPiso() {
            return numSalonPorPiso;
        }

        public void setNumSalonPorPiso(int numSalonPorPiso) {
            this.numSalonPorPiso = numSalonPorPiso;
        }

        public int getNumDePiso() {
            return numDePiso;
        }

        public void setNumDePiso(int numDePiso) {
            this.numDePiso = numDePiso;
        }

        public int getCapacidadPorSalon() {
            return capacidadPorSalon;
        }

        public void setCapacidadPorSalon(int capacidadPorSalon) {
            this.capacidadPorSalon = capacidadPorSalon;
        }

        public int getNumDeSalones() {
            return numDeSalones;
        }

        public void setNumDeSalones(int numDeSalones) {
            this.numDeSalones = numDeSalones;
        }
    }
    static class Universidad{
        private int numEstudiantes;

        public int getNumEstudiantes() {
            return numEstudiantes;
        }

        public void setNumEstudiantes(int numEstudiantes) {
            this.numEstudiantes = numEstudiantes;
        }
    }

    public static void calcularNumSalones(Edificio e, Universidad u){
        e.setNumDeSalones((int)ceil((double) u.getNumEstudiantes()/e.getCapacidadPorSalon()));
    }
    public static void calcularNumPisos(Edificio e){
        e.setNumDePiso((int)ceil((double) e.getNumDeSalones() / e.getNumSalonPorPiso()));
    }


    public static void main(String[] args){

        Edificio edificio = new Edificio();
        Universidad u = new Universidad();

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero de estudiantes: ");
        u.setNumEstudiantes(scan.nextInt());
        System.out.println("Ingrese la capacidad de cada salon: ");
        edificio.setCapacidadPorSalon(scan.nextInt());
        System.out.println("Ingrese la cantidad de salones por piso: ");
        edificio.setNumSalonPorPiso(scan.nextInt());

        calcularNumSalones(edificio, u);
        calcularNumPisos(edificio);

        System.out.println("El numero de salones que se requieren: " + edificio.getNumDeSalones());
        System.out.println("El edificio va tener: " + edificio.getNumDePiso()+ " numero de pisos");

    }
}
