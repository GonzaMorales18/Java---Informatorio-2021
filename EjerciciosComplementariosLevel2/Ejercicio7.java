package EjerciciosComplementariosLevel2;

import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo número (mayor que el primero): ");
        int num2 = input.nextInt();
        System.out.println(Arrays.toString(fizzBuzzFuncion(num1,num2).toArray()));
        input.close();
    }

    public static List<String> fizzBuzzFuncion(int x, int y){
        List<String> cadena = new ArrayList<>();
        for (int i=x; i<y; i++){
            if (i%2==0 && i%3!=0){
                cadena.add("Fizz");
            } else if (i%3==0 && i%2!=0) {
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
