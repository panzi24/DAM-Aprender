package ejerciciosUnidad4;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio8 {

	public static void main(String[] args) {

		Random rn = new Random();

		String[] abcVocalesArray = {"a", "e", "i", "o", "u"};
		String[] abcNumerosArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String[] abcConsonantesArray = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};

		// Parte 1: vocales
		System.out.println("Creamos la parte 1 con vocales");
		System.out.println(Arrays.toString(abcVocalesArray));

		String palabraRandom = "";
		int posicionRandom = 0;

		for (int i = 0; i < 5; i++) {
			posicionRandom = rn.nextInt(abcVocalesArray.length);
			palabraRandom += abcVocalesArray[posicionRandom];
			System.out.println("Palabra vocales: " + palabraRandom);
		}

		// Contamos las letras a
		int contadorA = 0;
		String[] palabraArray = palabraRandom.split("");

		for (int i = 0; i < palabraArray.length; i++) {
			if ("a".equals(palabraArray[i])) {
				contadorA++;
			}
		}
		System.out.println("Contador de a: " + contadorA);
		System.out.println("-".repeat(50));

		// Parte 2: numeros
		System.out.println("Creamos la parte 2 con numeros");
		System.out.println(Arrays.toString(abcNumerosArray));

		String palabraRandomNumeros = "";
		int numeroRandomNumeros = 0;

		for (int i = 0; i < 4; i++) {
			numeroRandomNumeros = rn.nextInt(abcNumerosArray.length);
			palabraRandomNumeros += abcNumerosArray[numeroRandomNumeros];
			System.out.println("Palabra numeros: " + palabraRandomNumeros);
		}

		// Sumamos los numeros
		String[] numeroArray = palabraRandomNumeros.split("");
		int sumaNumeros = 0;

		for (int i = 0; i < numeroArray.length; i++) {
			for (int j = 0; j < abcNumerosArray.length; j++) {
				if (numeroArray[i].equals(abcNumerosArray[j])) {
					System.out.println(i + " es la " + j);
					sumaNumeros += j;
				}
			}
		}
		System.out.println("Suma numeros: " + sumaNumeros);
		System.out.println("-".repeat(50));

		// Parte 3: consonantes
		System.out.println("Creamos la parte 3 con consonantes");
		System.out.println("Longitud de las consonantes: " + abcConsonantesArray.length);

		String palabraRandomConsonantes = "";
		int numeroRandomConsonantes = 0;

		for (int i = 0; i < 5; i++) {
			numeroRandomConsonantes = rn.nextInt(abcConsonantesArray.length);
			palabraRandomConsonantes += abcConsonantesArray[numeroRandomConsonantes];
			System.out.println("Palabra consonante: " + palabraRandomConsonantes);
		}

		// Sumamos consonantes y contamos la c
		String[] consonanteArray = palabraRandomConsonantes.split("");
		int sumaConsonante = 0;
		int contadorC = 0;

		for (int i = 0; i < consonanteArray.length; i++) {
			for (int j = 0; j < abcConsonantesArray.length; j++) {
				if (consonanteArray[i].equals(abcConsonantesArray[j])) {
					System.out.println(i + " es la " + j);
					sumaConsonante += j;

					if ("c".equals(consonanteArray[i])) {
						contadorC++;
					}
				}
			}
		}
		System.out.println("Suma consonantes: " + sumaConsonante);
		System.out.println("Contador c: " + contadorC);
		System.out.println("-".repeat(50));

		// Juntamos la contraseña y sacamos las partes
		String passwordFinal = palabraRandom + palabraRandomNumeros + palabraRandomConsonantes;
		System.out.println("Password final: " + passwordFinal);

		String passwordParte1 = passwordFinal.substring(0, 5);
		System.out.println("Pass parte 1: " + passwordParte1);

		String passwordParte2 = passwordFinal.substring(5, 9);
		System.out.println("Pass parte 2: " + passwordParte2);

		String passwordParte3 = passwordFinal.substring(9, 14);
		System.out.println("Pass parte 3: " + passwordParte3);
		System.out.println("-".repeat(50));

		// Comprobamos si en la parte 2 las posiciones pares suman 2
		String[] parte2Array = passwordParte2.split("");
		int sumaParesParte2 = 0;

		for (int i = 0; i < parte2Array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < abcNumerosArray.length; j++) {
					if (parte2Array[i].equals(abcNumerosArray[j])) {
						sumaParesParte2 += j;
					}
				}
			}
		}

		System.out.println("Suma pares parte 2: " + sumaParesParte2);
		if (sumaParesParte2 == 2) {
			System.out.println("Las posiciones pares suman 2");
		} else {
			System.out.println("No suman 2");
		}
	}
}