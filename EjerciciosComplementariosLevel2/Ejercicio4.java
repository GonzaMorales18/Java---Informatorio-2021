package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> alumnos = new ArrayList<>();
        int alumno = 1;
        System.out.println("Ingrese los nombres de los 12 alumnos: ");
        while (alumno <=12){
            System.out.println("Alumno " + alumno + "#:");
            String alu = input.nextLine();
            alumnos.add(alu);
            alumno = alumno + 1;
        }
        input.close();
        DividirEnCursos(alumnos);
    }

    public static void DividirEnCursos(List<String> x){
        System.out.println("\nCurso A: ");
        List<String> cursoA = x.subList(0, 4);
        for (String i:cursoA){
            System.out.print(i + "   ");
        }
        System.out.println("\nCurso b: ");
        List<String> cursoB = x.subList(4, 8);
        for (String i:cursoB){
            System.out.print(i + "   ");
        }
        System.out.println("\nCurso C: ");
        List<String> cursoC = x.subList(8, 12);
        for (String i:cursoC){
            System.out.print(i + "   ");
        }
    }
}
