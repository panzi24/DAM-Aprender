package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		double KB = 0.0;
		double GB = 0.0;
		double TB = 0.0;
		double MB = 0.0;
		double bytes = 0.0;
		
		
		
		System.out.println("Dime un valor en MB: ");
		
		MB = sc.nextDouble();
		
		KB = MB * 1024;
		GB = MB / 1024;
		TB = MB / (1024*1024);
		bytes = MB * (1024*1024);
		
		
		System.out.printf("%-20s %-20s %-20s %-20s %-20s%n ","Byte" ,"KiloByte", "MegaByte", "GigaByte", "TeraByte");
		System.out.printf("%-20.2f %-20.2f %-20.2f %-20.2f %-20.6f ", bytes ,KB, MB, GB, TB);
		
		
		
		
		
		

	}

}
