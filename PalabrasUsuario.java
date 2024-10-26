import java.util.Scanner;

public class PalabrasUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introcuzca la palabra 1: ");
        String palabra1 = entrada.nextLine();

        System.out.println("Introduzca la palabra 2: ");
        String palabra2 = entrada.nextLine();

        System.out.println("Introduzca la palabra 3: ");
        String palabra3 = entrada.nextLine();

        System.out.println(palabra1+" "+ palabra2+" "+ palabra3);

        entrada.close();

    }
}