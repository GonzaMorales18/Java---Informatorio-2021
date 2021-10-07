package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        input.close();
        System.out.println(Sumar(num1, num2));
        System.out.println(Restar(num1, num2));
        System.out.println(Multiplicar(num1, num2));
        System.out.println(Dividir(num1, num2));
        System.out.println(Modulear(num1, num2));
    }

    public static String Sumar(int x1, int x2){
        int suma = x1 + x2;
        return x1 + " + " + x2 + " = " + suma;
    }

    public static String Restar(int x1, int x2){
        int resta = x1 - x2;
        return x1 + " - " + x2 + " = " + resta;
    }

    public static String Multiplicar(int x1, int x2){
        int multiplicacion = x1 * x2;
        return x1 + " * " + x2 + " = " + multiplicacion;
    }

    public static String Dividir(int x1, int x2){
        int division = x1 / x2;
        return x1 + " / " + x2 + " = " + division;
    }

    public static String Modulear(int x1, int x2){
        int modulo = x1 % x2;
        return x1 + " % " + x2 + " = " + modulo;
    }
}
