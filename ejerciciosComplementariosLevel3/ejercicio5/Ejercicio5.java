package ejerciciosComplementariosLevel3.ejercicio5;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(new Alumno("Homero", "Simpson", LocalDate.now().minusYears(30)));
        Map<String, Long> resultado = alumnos.stream().collect(Collectors.toMap(Alumno::getNombreCompuesto, Alumno::getEdad));
        System.out.println(resultado);
    }
}
