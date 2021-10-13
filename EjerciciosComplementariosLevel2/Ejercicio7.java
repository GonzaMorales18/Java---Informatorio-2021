package EjerciciosComplementariosLevel2;

import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> lista = fizzBuzzFuncion(1,6); // Profe, no encuentro la manera de ingresar con el Scanner una función, así que lo hice así :(
        System.out.println(Arrays.toString(lista.toArray()));

        input.close();
    }

    public static List<String> fizzBuzzFuncion(int x, int y){
        List<String> cadena = new ArrayList<>();
        for (int i=x; i<y; i++){
            if (i%2==0){
                cadena.add("Fizz");
            } else if (i%3==0) {
                    cadena.add("Buzz");
                } else if (i%2==0 && i%3==0){
                        cadena.add("FizzBuzz");
                    } else {
                        cadena.add(String.valueOf(i));
                    }
        }
        return cadena;
    }
}
