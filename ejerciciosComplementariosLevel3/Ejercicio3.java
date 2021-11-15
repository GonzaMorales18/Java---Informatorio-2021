package ejerciciosComplementariosLevel3;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        long contador = palabras.stream().filter(str -> str.startsWith("B") || str.startsWith("b")).count();
        System.out.println(contador);
    }
}
