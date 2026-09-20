package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un valor para A: ");
		double a = sc.nextDouble();
		
		System.out.println("Dame un valor para B");
		double b = sc.nextDouble();
		
		System.out.println("Dame un valor para C");

		double c = sc.nextDouble();
		
		
		
		double calc = Math.pow(b, 2) - 4*a*c;
		
		double raizCuadrada = Math.sqrt(calc);
		
		double x = (-b + raizCuadrada) / (2 * a);
		
		System.out.println("El valor de X siendo A = " + a + " B = " + b + " y C = " + c + " es igual a = " + x );
		
	}

}
