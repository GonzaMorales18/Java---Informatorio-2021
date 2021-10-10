package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un texto:");
        String palabra = scan.nextLine();
        scan.close();
        char[] ch = palabra.toCharArray();
        for (char e: ch){
            int value = (int) e;
            if (value >= 97 && value <122){ 
                value = value -32;
                System.out.print((char) value);
            } else if (value == 241) {
                value = value -32;
                System.out.print((char) value);
            }else{
                System.out.print((char) value); 
            }
        }
    }
}


