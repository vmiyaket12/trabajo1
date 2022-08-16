package ejercicios;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ejercicio6 {
    static class Triangulo{
        private double altura;
        private double base;
        private double hipotenusa;
        private double areaT;
        private double perimetroT;

        public Triangulo(){}
        public double getAltura() {
            return altura;
        }
        public void setAltura(double altura) {
            this.altura = altura;
        }
        public double getBase() {
            return base;
        }
        public void setBase(double base) {
            this.base = base;
        }
        public double getHipotenusa() {
            return hipotenusa;
        }
        public void setHipotenusa() {
            this.hipotenusa = sqrt(pow(this.altura,2)+ pow(this.base,2));
        }

        public double getAreaT() {
            return (this.altura*this.base)/2;
        }

        public void setAreaT(double areaT) {
            this.areaT = areaT;
        }

        public double getPerimetroT() {
            return perimetroT;
        }

        public void setPerimetroT() {
            this.perimetroT = this.altura+this.base+this.hipotenusa;
        }
    }

    static class Rectangle{
        private double sideC;
        private double sideB;
        private double areaR;
        private double perimeterR;
        public Rectangle(){}

        public double getSideC() {
            return sideC;
        }

        public void setSideC(double sideC) {
            this.sideC = sideC;
        }

        public double getSideB() {
            return sideB;
        }

        public void setSideB(double sideB) {
            this.sideB = sideB;
        }

        public double getAreaR() {
            return areaR;
        }

        public void setAreaR() {
            this.areaR = this.sideC * this.sideB;
        }

        public double getPerimeterR() {
            return perimeterR;
        }

        public void setPerimeterR() {
            this.perimeterR = 2*this.sideC + 2*this.sideB;
        }
    }


    public static void calcAlturaTriangulo(double a, double c,Triangulo triangulo){
        triangulo.setAltura(a-c);
    }


    public static double terrenoC(Triangulo triangulo, Rectangle rectangle){
        return triangulo.getPerimetroT() + rectangle.getPerimeterR();
    }

    public static void main(String[] args){
        double a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        a = scan.nextDouble();

        System.out.println("Ingrese el valor de B ");
        b = scan.nextDouble();

        System.out.println("Ingrese el valor de C ");
        c = scan.nextDouble();

        Triangulo triangulo = new Triangulo();
        Rectangle rectangle = new Rectangle();
        calcAlturaTriangulo(a,c,triangulo);
        triangulo.setBase(b);
        triangulo.setHipotenusa();
        triangulo.setPerimetroT();
        rectangle.setSideC(c);
        rectangle.setSideB(b);
        rectangle.setPerimeterR();
        rectangle.setAreaR();

        System.out.println("El area del rectangulo es: " + rectangle.getAreaR());
        System.out.println("El area del triangulo es: " + triangulo.getAreaT());
        System.out.println("El perimetro del rectangulo es: " + rectangle.getPerimeterR());
        System.out.println("El perimetro del triangulo es: " + triangulo.getPerimetroT());
        System.out.println("El perimetro total del terreno es: " + terrenoC(triangulo,rectangle));
        System.out.println("La hipotenusa es: " + triangulo.hipotenusa);
    }

}
