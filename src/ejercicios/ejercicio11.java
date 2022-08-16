package ejercicios;

import java.util.Scanner;

public class ejercicio11 {
    public static String convertToRoman(int a) throws Exception {
        if(a>=0 && a<=99){
            String[] units = {"", "I", "II", "I", "IV", "V", "VI", "VII", "VIII", "IX"};
            String[] tens = {"", "X", "X", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            return tens[(a % 100) / 10] + units[a % 10];
        }else {

            throw new Exception ("No se puede con ese numero");
        }
    }


    public static void main(String[] args) throws Exception {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1-99");
        a = scan.nextInt();
        System.out.println("Numero Romano: "+ convertToRoman(a));
    }
}
