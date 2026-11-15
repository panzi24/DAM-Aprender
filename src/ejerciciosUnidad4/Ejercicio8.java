package ejerciciosUnidad4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rn = new Random();
		
		String frase01 = "Hola buenas tardes";
		
		String[] abcMinArray = {"a", "e", "i", "o", "u"};
		
		System.out.println(Arrays.toString(abcMinArray));
		
	 	int posicionRandom = 0;
		
		posicionRandom = rn.nextInt(5);
		
		String letraRandom = abcMinArray[posicionRandom];
		
		System.out.println("Posicion random: " + posicionRandom);
		System.out.println("Letra random: " + letraRandom);
		System.out.println("-".repeat(50));

		
		String palabraRandom = "";
		for(int i = 0; i < abcMinArray.length; i++) {
			posicionRandom = rn.nextInt(5);
			letraRandom = abcMinArray[posicionRandom];
			palabraRandom += letraRandom;
			System.out.println("Letra random: " + palabraRandom);

		}
		System.out.println("-".repeat(50));

		int contadorA = 0;
		
		String[] palabraArray = palabraRandom.split("");

		
		for (int i = 0; i < abcMinArray.length; i++) {
			System.out.println(palabraRandom.charAt(i));
			String strgingA = "" + palabraRandom.charAt(i);
			if ("a".equals(palabraArray[i])) {
				contadorA++;
				
				
			}
			System.out.println("Letra " + palabraArray[i]);
			System.out.println("Contador " +contadorA);
		}
		System.out.println("-".repeat(50));
		System.out.println("Contador de a: " + contadorA);
		
		System.out.println("-".repeat(50));
		System.out.println("Crear una contraseña que tenga A");
		
		String contrasena = "";
		int contadorAContrasena = 0;
		
		while (contadorAContrasena < 2) {
			contrasena = "";
			contadorAContrasena = 0;
			
			
			for (int i = 0; i < abcMinArray.length; i++) {
				int pos = rn.nextInt(abcMinArray.length);
				String letra = abcMinArray[pos];
				contrasena += letra;
				
				if ("a".equals(letra)) {
					contadorAContrasena++;
				}
			}
			
			
		}
		
		System.out.println("Contraseña hecha: " + contrasena);
		System.out.println("Cantidad de 'a' en la contraseña: " + contadorAContrasena);
		
	}

}
