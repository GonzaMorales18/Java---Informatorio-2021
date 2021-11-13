package ejerciciosComplementariosLevel3;

import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        List<String> resultado = palabras.stream().filter(p -> Objects.nonNull(p) && p != "").collect(Collectors.toList());
        System.out.println(resultado);
    }
}
