package EjerciciosComplementariosLevel1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = input.nextLine();
        input.close();
        System.out.println("HOLA " + nombre);
    }
}
