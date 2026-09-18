package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Introduce los valores que desees calcular");
		
		String linea = "-".repeat(80);
		
		System.out.println("Valor X: ");
		double x = sc.nextDouble();
		System.out.println("Valor Y: ");
		double y = sc.nextDouble();
		
		double suma = x + y;
		double producto = x * y;
		double resta = x - y;
		double divi = x / y;
		
		System.out.printf("Los valores introducidos son %.2f y %.2f%n", x , y);
		
		System.out.printf("%30s %9s %12s %18s%n","Suma", "Resta", "Producto", "Cociente");
		
		System.out.println(linea);

		System.out.printf("%-5s", "x= " + x + " y= " + y);
		System.out.printf("%15s %8s %11s %15s%n" , suma, resta, producto, divi);
		System.out.println(linea);

		
	}

}
