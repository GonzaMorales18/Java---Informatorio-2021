package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una palabra/frase: ");
        String frase = input.nextLine();
        System.out.println("Ingrese una letra para ver cuantas veces se repite: ");
        String letra = input.nextLine();
        System.out.print(Repeticion(frase, letra));
        input.close();
    }

    public static int Repeticion(String fra, String let){
        int contador = 0;
        for (int i=0; i<fra.length(); i++){
            if (String.valueOf(fra.charAt(i)).equals(let)){
                contador =  contador + 1;
            }
        }
        return contador;
    }
}
