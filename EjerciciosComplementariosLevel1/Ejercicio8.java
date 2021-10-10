package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("¡Ingrese sus datos!\n");
        System.out.print("Nombre: ");
        String nomb = input.nextLine();
        System.out.print("Edad: ");
        String edad = input.nextLine();
        System.out.print("Dirección: ");
        String dire = input.nextLine();
        System.out.print("Ciudad: ");
        String ciud = input.nextLine();
        System.out.print(Datos(nomb, edad, dire, ciud));
        input.close();
    }
    public static String Datos(String nom, String eda, String dir, String ciu){
        return ciu + " - " + dir + " - " + eda + " - " + nom;
    }
}
