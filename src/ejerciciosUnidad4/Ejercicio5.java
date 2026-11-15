package ejerciciosUnidad4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la dimension del vector:");
		int dimension = sc.nextInt();
		
		int[] vector = new int[dimension];
		
		System.out.println("Tu vector es: ");
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = rn.nextInt(101); 
			System.out.print(vector[i] + " ");
		}
		
		System.out.println(); 
		
		int[] vectorCopia = Arrays.copyOfRange(vector, 0, vector.length);
		
		Arrays.sort(vectorCopia);
		
		if (Arrays.equals(vector, vectorCopia)) {
			System.out.println("El vector sí está ordenado");
		} else {
			System.out.println("El vector no está ordenado");
		}
		
		sc.close();
	}
}