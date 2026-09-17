package bucles;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que tabla quieres?");
        int tabla = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(tabla + " * " + i + " = " + i * tabla);
        }

        int suma = 0;
        int numero;

        System.out.println("Dame un número (0 para salir): ");
        numero = sc.nextInt();

        while (numero != 0) {
            suma = suma + numero;
            System.out.println("Dame un número (0 para salir): ");
            numero = sc.nextInt();
        }

        System.out.println("La suma total es: " + suma);
    }
}