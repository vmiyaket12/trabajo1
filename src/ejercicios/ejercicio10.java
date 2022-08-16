package ejercicios;

import java.util.Scanner;

import static java.lang.Math.ceil;
import static java.lang.Math.pow;

public class ejercicio10 {
    public static int operador(int a, int b, String o){
        int res;
        if(o.equals("+")){
            res = a + b;
        } else if (o.equals("-")) {
            res = a - b;
        } else if (o.equals("*")) {
            res = a * b;
        } else if (o.equals("/")) {
            res = (int)ceil((double)a/b);
        } else if (o.equals("%")){
            res = a%b;
        } else if(o.equals("**")) {
            res = (int) pow((double) a, (double) b);
        }else{
            throw new ArithmeticException("No es un operador Aritmetico");
        }

        return res;
    }


    public static void main(String[] args){

        int a,b;
        String operador;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        a = scan.nextInt();
        System.out.println("Ingrese un operador (+,-, *, /,%,**)");
        operador=scan.next();
        System.out.println("Ingrese otro numero");
        b = scan.nextInt();

        System.out.println("El resultado es: "+ operador(a,b, operador));

    }
}
