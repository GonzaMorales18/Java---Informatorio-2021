package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> ciudades = new ArrayList<>();
        System.out.print("Ingrese su 3# ciudad favorita: ");
        String ciu3 = input.nextLine();
        System.out.print("Ingrese su 2# ciudad favorita: ");
        String ciu2 = input.nextLine();
        System.out.print("Ingrese su 1# ciudad favorita: ");
        String ciu1 = input.nextLine();
        input.close();
        ciudades.add(ciu1);
        ciudades.add(ciu2);
        ciudades.add(ciu3);
        Ranking(ciudades);
    }


    public static void Ranking(List<String> ciu){
        int contador = 1;
        for (String ciudad:ciu){
            String redo = contador + "# - " + ciudad + "\n";
            contador = contador+ 1;
            System.out.print(redo);
        }
    }
}
