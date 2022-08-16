package ejercicios;

import java.util.Scanner;

import static java.lang.Math.max;

public class ejercicio9 {
    public static int retornarMax(int a, int b){
        return max(a,b);
    }

    public static void main(String[] args){

        int a,b;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        a = scan.nextInt();
        System.out.println("Ingrese otro numero");
        b = scan.nextInt();

        System.out.println("EL numero mayor es: "+ retornarMax(a,b));
    }

}
