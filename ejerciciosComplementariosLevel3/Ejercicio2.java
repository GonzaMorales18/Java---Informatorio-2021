package ejerciciosComplementariosLevel3;

import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,3,4,5);
        List<Integer> potencia = numeros.stream().map(num -> elevarCuadrado(num)).collect(Collectors.toList());
        System.out.println(potencia);
    }

    private static Integer elevarCuadrado(Integer n) {
        return n*n;
    }
}
