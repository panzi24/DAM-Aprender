package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Dame valor A: ");
		double base = sc.nextDouble();
		
		System.out.println("Dame valor B: ");
		double altura = sc.nextDouble();
		
		double area = (base * altura) / 2; 
		
		System.out.printf("El triángulo de base %.2f y altura %.2f tiene un área de %.2f", base, altura, area);
		
		
	}

}
