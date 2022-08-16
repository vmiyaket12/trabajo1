package ejercicios;

import java.util.Scanner;

public class ejercicio4 {
    static class Gastos {
        public double arriendo;
        public double comida;
        public double dineroRestante;

        public Gastos(double arriendo, double comida, double dineroRestante) {
            this.arriendo = arriendo;
            this.comida = comida;
            this.dineroRestante = dineroRestante;
        }
    }

    public static Gastos calcGastos(double sueldo){

        return new Gastos(sueldo * 0.4,sueldo *.15,(sueldo-((sueldo*.4)+(sueldo*.15))));
    }

    public static void main(String[] args){
        double x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero recibido");
        x = scan.nextDouble();
        Gastos gasto = calcGastos(x);

        System.out.println(gasto.arriendo);
        System.out.println(gasto.comida);
        System.out.println(gasto.dineroRestante);
    }
}
