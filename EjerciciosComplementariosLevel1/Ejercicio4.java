package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número para calcular su factorial: ");
        int numero = input.nextInt();
        input.close();
        System.out.println("El factorial de " + numero + " es: " + factorial(numero));
    }

    public static int factorial(int num){
        if (num == 1) {
            return num;
        } else { 
            return (num * factorial(num -1));
        }
    }
}
