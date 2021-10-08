package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número a calcular su potencia: ");
        int numx = input.nextInt();
        System.out.println("Ingrese el número de la potencia: ");
        int numpot = input.nextInt();
        input.close();
        System.out.println(numx + " elevado a " + numpot + " = " + Potencia(numx, numpot));
    }

    public static int Potencia(int x, int pot){
        if (pot == 0){
            return 0;
        } else if (pot == 1){
            return x;
        } else {
            int result = x;
            for (int i=1; i<pot; i=i+1){
                result *= x;
            }
            return result;
        }
    }
}