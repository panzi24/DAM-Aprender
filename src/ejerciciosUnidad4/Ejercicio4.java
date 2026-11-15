package ejerciciosUnidad4;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int opcionMenuUser = 0;
		int controlMenu = 0;

		
		
		
		while (controlMenu == 0) {


		
			System.out.println("1.- Longitud de una cadena: ");
			System.out.println("2.- Comparación de dos cadenas: ");
			System.out.println("3.- Concatenación de dos cadenas: ");
			System.out.println("4.- Obtener subcadenas: ");
			System.out.println("5.- Invertir cadenas: ");
			System.out.println("6.- Es palíndromo: ");
			System.out.println("opción 9 salir del programa: ");
			System.out.println("-".repeat(50));
			System.out.println("Elige una opcion: ");



			opcionMenuUser = sc.nextInt();

			sc.nextLine();

			switch (opcionMenuUser) {
			case 1:
				System.out.println("Introduce algun texto: ");
				String userTexto = sc.nextLine();
				
				
				int longitud = userTexto.length();
				
				System.out.println("La longitud de la cadena es: " + longitud + " caracteres.");
				System.out.println("-".repeat(50));


				break;
				
			case 2:
				System.out.println("Introduce el primer texto: ");
				String texto1 = sc.nextLine();
				
				System.out.println("Introduce el segundo texto: ");
				String texto2 = sc.nextLine();
				
				
				
				int resultado = texto1.compareTo(texto2);
				
				
				if (resultado > 0) {
				    System.out.println("La cadena mayor alfabéticamente es: " + texto1);
				} else if (resultado < 0) {
				    System.out.println("La cadena mayor alfabéticamente es: " + texto2);
				} else {
				    System.out.println("Ambas cadenas son exactamente iguales.");
				}
				
				
				System.out.println("-".repeat(50));
				

				break;
				
			case 3:
				
				
				System.out.println("Introduce la primera cadena: ");
				String texto3 = sc.nextLine();

				System.out.println("Introduce la segunda cadena: ");
				String texto4 = sc.nextLine();

				// Concatenamos usando el signo +, añadiendo un espacio en medio
				String resultado2 = texto3 + " " + texto4;

				// Si quisieras que se pegaran literalmente sin espacio, sería: texto1 + texto2
				// O usando el método de los String: texto1.concat(texto2)

				System.out.println("Las cadenas concatenadas son: " + resultado2);
				System.out.println("-".repeat(50));
				
				break;
			case 4:
				
				System.out.println("Introduce una cadena de texto: ");
				String texto = sc.nextLine();

				System.out.println("Introduce el primer número (inicio): ");
				int inicio = sc.nextInt();

				System.out.println("Introduce el segundo número (fin): ");
				int fin = sc.nextInt();

				// Limpiamos el buffer tras leer los números
				sc.nextLine();

				// Extraemos la subcadena
				String subcadena = texto.substring(inicio, fin);

				System.out.println("La subcadena resultante es: " + subcadena);
				System.out.println("-".repeat(50));
				
				
				
				break;
				
			case 5:
				
				System.out.println("Introduce una cadena para invertir: ");
				String textoOriginal = sc.nextLine();

				// Usamos StringBuilder para invertir la cadena fácilmente
				StringBuilder sb = new StringBuilder(textoOriginal);
				String textoInvertido = sb.reverse().toString();

				System.out.println("La cadena invertida es: " + textoInvertido);
				System.out.println("-".repeat(50));


				
				break;
				
			case 6:
				
				System.out.println("Introduce una cadena para comprobar si es un palíndromo: ");
				String textoOriginal2 = sc.nextLine();
				
				String textoLimpio = textoOriginal2.trim().toLowerCase();				
				
				String textoInvertido2 = new StringBuilder(textoLimpio).reverse().toString();
				
				if (textoLimpio.equals(textoInvertido2)) {
				    System.out.println("La cadena SÍ es un palíndromo.");
				} else {
				    System.out.println("La cadena NO es un palíndromo.");
				}

				System.out.println("-".repeat(50));
				
				break;
			

			case 9:
				System.out.println("Ejecutando opcion 0");
				controlMenu = 1;
				break;
			default:
				System.out.println("Número de programa no encontrado");
			}
		}

		System.out.println("Fin del program");	
		
	}


}
