package bucles;
import java.util.Scanner;


/*public class Main {
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
}*/

public class Main {
	public static void main(String[] args) {
		
		int sumaTotal = 100;
		int contadorInteraciones = 0;
		
		while (sumaTotal>0) {
			
			sumaTotal -= 5;
			contadorInteraciones = contadorInteraciones +1;
			System.out.println("Suma totaal: " + sumaTotal);
			System.out.println("Contador de iteraciones: " + contadorInteraciones);
			
		}
		
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Que tabla quieres?: ");
        int tabla = sc.nextInt();

        for (int i = 0; i < 11; i++) {
        	int resultado = i * tabla;
            System.out.println(tabla + " * " + i + " = " + resultado);
            
            if (resultado == 11) {
            	System.out.println("Me gusta el 10");
            }
            else if (resultado == 20) {
            	System.out.println("El 50 no me gusta pero el 10 si");
            }
            
        }
		
		
		
		
	}
}