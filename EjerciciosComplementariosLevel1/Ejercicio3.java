package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = input.nextInt();
        input.close();
        for (int i=1; i<=numero; i++) {
            for (int j=1; j<=i; j++) {
              System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
