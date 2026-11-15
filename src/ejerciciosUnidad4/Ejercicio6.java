package ejerciciosUnidad4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la dimensión de la matriz cuadrada (N):");
		int dimension = sc.nextInt(); 
		
		int[][] matriz = new int[dimension][dimension];
		
		System.out.println("Introduce los valores de la matriz:");
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				System.out.print("Fila " + i + ", Columna " + j + ": ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nMatriz introducida:");
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
		boolean esMagico = true;
		
		int sumaReferencia = 0;
		for (int j = 0; j < dimension; j++) {
			sumaReferencia += matriz[0][j];
		}
		
		for (int i = 1; i < dimension; i++) {
			int sumaFila = 0;
			for (int j = 0; j < dimension; j++) {
				sumaFila += matriz[i][j];
			}
			if (sumaFila != sumaReferencia) {
				esMagico = false;
				break; 
			}
		}
		
		if (esMagico) {
			for (int j = 0; j < dimension; j++) {
				int sumaColumna = 0;
				for (int i = 0; i < dimension; i++) {
					sumaColumna += matriz[i][j];
				}
				if (sumaColumna != sumaReferencia) {
					esMagico = false;
					break;
				}
			}
		}
		
		if (esMagico) {
			int sumaDiagonalPrincipal = 0;
			for (int i = 0; i < dimension; i++) {
				sumaDiagonalPrincipal += matriz[i][i];
			}
			if (sumaDiagonalPrincipal != sumaReferencia) {
				esMagico = false;
			}
		}
		
		if (esMagico) {
			int sumaDiagonalSecundaria = 0;
			for (int i = 0; i < dimension; i++) {
				sumaDiagonalSecundaria += matriz[i][dimension - 1 - i];
			}
			if (sumaDiagonalSecundaria != sumaReferencia) {
				esMagico = false;
			}
		}
		
		System.out.println("\nRESULTADO:");
		if (esMagico) {
			System.out.println("¡Es un Cuadrado Mágico! Todas las sumas dan " + sumaReferencia);
		} else {
			System.out.println("No es un Cuadrado Mágico.");
		}
		
		sc.close();
	}
}