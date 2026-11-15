package ejerciciosUnidad4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean passwordValido = false;
		
		System.out.println("--- VALIDADOR DE PASSWORD ---");
		
		do {
			System.out.print("Introduce un password: ");
			String password = sc.nextLine();
			
			int contadorMinusculas = 0;
			int contadorMayusculas = 0;
			int contadorNumeros = 0;
			int contadorSignos = 0;
			boolean contieneArroba = false;
			
			int longitud = password.length();
			
			for (int i = 0; i < longitud; i++) {
				char c = password.charAt(i);
				
				
				if (c >= 'a' && c <= 'z') {
					contadorMinusculas++;
				} 

				else if (c >= 'A' && c <= 'Z') {
					contadorMayusculas++;
				} 

				else if (c >= '0' && c <= '9') {
					contadorNumeros++;
				} 
				
				else if (c >= '-' && c <= '_'){
					contadorSignos++;
				}

				else if (c == '@') {
					contieneArroba = true;
				}
			}
			

			boolean regla1 = longitud >= 8;

			boolean regla2 = (contadorMinusculas * 2) >= longitud; 
			
			boolean regla3 = contadorMayusculas >= 2;
			boolean regla4 = contadorNumeros >= 3;
			boolean regla5 = contadorSignos >= 2;
			boolean regla6 = (contieneArroba == false);
			

			if (regla1 && regla2 && regla3 && regla4 && regla5) {
				passwordValido = true;
				System.out.println("\n¡Password correcto!");
			} else {

				System.out.println("\nERRORES ENCONTRADOS:");
				
				if (regla1 == false) {
					System.out.println("- Error: Ha de tener al menos 8 caracteres.");
				}
				if (regla2 == false) {
					System.out.println("- Error: Al menos la mitad deben ser minúsculas.");
				}
				if (regla3 == false) {
					System.out.println("- Error: Ha de tener al menos 2 mayúsculas.");
				}
				if (regla4 == false) {
					System.out.println("- Error: Ha de tener al menos 3 números.");
				}
				if (regla5) {
					System.out.println("- Error tienes que poner el signo - O _ dos veces");
				}
				if (regla6 == false) {
					System.out.println("- Error: NO puede incluir el carácter '@'.");
				}
				
				System.out.println("Vuelve a intentarlo.\n");
			}
			
		} while (passwordValido == false);
		
		sc.close();
	}
}