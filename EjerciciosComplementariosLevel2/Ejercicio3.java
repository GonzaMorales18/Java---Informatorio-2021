package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> baraja = new ArrayList<>();
        int cartas = 1;
        System.out.println("Ingrese las 13 cartas de la baraja francesa en orden: ");
        while (cartas <=13){
            System.out.println(cartas + "# carta: ");
            String car = input.nextLine();
            baraja.add(car);
            cartas = cartas + 1;
        }
        input.close();
        Imprimir(baraja);
        ImprimirInversa(baraja);
        ImprimirMezclada(baraja);
    }

    public static void Imprimir(List<String> x){
        System.out.println("\nBaraja acomodada: ");
        for (String i:x){
            System.out.print(i + " ");
        }
    }

    public static void ImprimirInversa(List<String> x){
        Collections.reverse(x);
        System.out.println("\nBaraja inversa: ");
        for (String i:x){
            System.out.print(i + " ");
        }
    }

    public static void ImprimirMezclada(List<String> x){
        Collections.shuffle(x);
        System.out.println("\nBaraja mezclada: ");
        for (String i:x){
            System.out.print(i + " ");
        }
    }
}
