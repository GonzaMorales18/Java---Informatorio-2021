package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        input.close();
        System.out.println(num1 + " x " + num2 + " = " + Multiplicar(num1, num2));
    }

    public static int Multiplicar(int x1, int x2){
        if (x2 == 0){
            return 0;
        } else if (x2 == 1){
            return x1;
        } else {
            return x1 + Multiplicar(x1, x2-1);
        }
    }
}
