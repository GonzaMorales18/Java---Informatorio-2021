package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int cont = 1;
        while (cont<=5){
            System.out.println("Ingrese el " + cont + "# número: ");
            int num = input.nextInt();
            numeros.add(num);
            cont = cont + 1;
        }
        System.out.println("Ingrese el primer número a agregar: ");
        int num1 = input.nextInt();
        numeros.add(0, num1);
        System.out.println("Ingrese el útimo número a agregar: ");
        int num2 = input.nextInt();
        numeros.add(num2);
        MostrarLista(numeros);
        input.close();
    }

    public static void MostrarLista(List<Integer> x){
        System.out.println("Elementos de la lista modificada: " + x.size());
        System.out.print("Elementos: " );
        for (int i:x){
            System.out.print(i + ", ");
        }

        x.remove(0);
        x.remove(x.size()-1);

        System.out.println("\nElementos de la lista sin modificar: " + x.size());
        System.out.print("Elementos: " );
        for (int i:x){
            System.out.print(i + ", ");
        }
    }
}
