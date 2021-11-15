package ejerciciosComplementariosLevel3;

import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);
        Set<Integer> factorial = numeros.stream().map(num -> factorizar(num)).collect(Collectors.toSet());
        System.out.println(factorial);
    }

    public static int factorizar(int num){
        if (num == 1) {
            return num;
        } else { 
            return (num * factorizar(num -1));
        }
    }
}
