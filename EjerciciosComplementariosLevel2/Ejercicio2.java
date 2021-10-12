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

    public static void AgregarALista(){

    
    }
}
