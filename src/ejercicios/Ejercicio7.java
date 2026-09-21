package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Como te llamas: ?");
		String name = sc.next();
		
		System.out.println("¿Cual es tu NIF: ?");
		String NIF = sc.next();
		
		System.out.println("Indica tu domicilio: ");
		String domicilio = sc.next();
		
		
		
		
		
		
		String[] conceptos = new String[5];
		int[] cantidades = new int[5];
		double[] precios = new double[5];
		double[] importes = new double[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Concepto " + (i+1));
			conceptos[i] = sc.next();
			
			System.out.println("Cantidad " + (i+1));
			cantidades[i] = sc.nextInt();
			
			System.out.println("Precios " + (i+1));
			precios[i] = sc.nextDouble();

			importes[i] = cantidades[i] * precios[i];
			

		}
		
		System.out.println("¿Cual es el descuento?: ");
		double descuento = sc.nextDouble();
		double descuentoDivision = descuento / 100;
		
		double totalBruto = 0.0;
		
		for (int i = 0; i  < importes.length; i++) {
			totalBruto = totalBruto + importes[i];
		}
		
		double totalFinalDescuento = totalBruto * descuentoDivision; 
		double totalfinal = totalBruto - totalFinalDescuento;
		
		
		
		
		System.out.println("CLIENTE: " + name + "   NIF: " + NIF);
		System.out.println("DOMICILIO: " + domicilio);
		System.out.println();

		System.out.printf("%-10s %-20s %-10s %-10s%n", "CANTIDAD", "CONCEPTO", "PRECIO", "IMPORTE");
		System.out.println("-".repeat(55));

		for (int i = 0; i < 5; i++) {
		    System.out.printf("%-10d %-20s %-10.2f %-10.2f%n", cantidades[i], conceptos[i], precios[i], importes[i]);
		}

		System.out.println("-".repeat(55));
		System.out.printf("TOTAL BRUTO: %.2f%n", totalBruto);
		System.out.printf("DESCUENTO: %.2f%%%n", descuento);
		System.out.printf("TOTAL: %.2f%n", totalfinal);
		
	}

}
