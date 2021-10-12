package EjerciciosComplementariosLevel2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese las horas semanales: ");
        String horas = input.nextLine();
        int[] horasTrabajadas = CrearLista(horas);
        System.out.println("Ingrese los valores de las horas: ");
        String valor = input.nextLine();
        int[] valorPorHora = CrearLista(valor);
        input.close();
        int[] totalesDiarios = Totales(horasTrabajadas, valorPorHora);
        System.out.println("\n" + Arrays.toString(totalesDiarios));
        int totalSemanal = TotalSemanal(totalesDiarios);
        System.out.println("Total Final: $ " + totalSemanal);
    }

    public static int[] CrearLista(String x){
        x = x.replace("[", "");
        x = x.replace("]", "");
        x = x.replace(" ", "");
        String[] arrayStr = x.split(",");
        int[] arrayInt = new int[arrayStr.length];
        for(int i=0; i<arrayStr.length; i++){
            arrayInt[i] = Integer.parseInt(arrayStr[i]);
        }
        return arrayInt;
    }

    public static int[] Totales(int[] x, int[] y){
        int[] arrayInt = new int[x.length];
        for (int i=0; i<x.length; i++){
            int z = x[i] * y[i];
            arrayInt[i] = z;
        }
        return arrayInt;
    } 

    public static int TotalSemanal(int[] x){
        int tot = 0;
        for (int i:x){
            tot = tot + i;
        }
        return tot;
    }
}
