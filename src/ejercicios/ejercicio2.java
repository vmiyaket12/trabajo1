package ejercicios;

import java.io.IOException;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.*;

public class ejercicio2 {

    public static String nextDay(int day){
        String date;

        if(day == 7){
            day = 0;
        }
        switch (day+1){
            case 1:
                date = "MONDAY";
                break;
            case 2:
                date = "TUESDAY";
                break;
            case 3:
                date = "WEDNESDAY";
                break;
            case 4:
                date = "THURSDAY";
                break;
            case 5:
                date = "FRIDAY";
                break;
            case 6:
                date = "SATURDAY";
                break;
            case 7:
                date = "SUNDAY";
                break;
            default:
                date = "INVALID DATE";
                break;
        }
        return date;
    }



    public static void main(String[] args) throws Exception {
        String day;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el dia de la semana (en ingles): ");
        day = scan.nextLine().toUpperCase();
        DayOfWeek week= DayOfWeek.valueOf(day);
        int num = week.getValue();
        System.out.println("El dia siguiente es: " + nextDay(num));
    }
}
