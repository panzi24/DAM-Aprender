package ejerciciosUnidad2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cual es tu nota del primer control?: ");
		double notaUno = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("¿Cual es tu nota del segundo control?: ");
		double notaDos = sc.nextInt();
		
		sc.nextLine();
		
		String recuperacionNota = "";
		
		double mediaNotas = (notaUno + notaDos) / 2;

			
			while (true) {
				
				
				if (mediaNotas >= 5) {
					System.out.println("Nota del primer control: " + notaUno);
					System.out.println("Nota del segundo control: " + notaDos);
					System.out.println("Tu nota de programación: " + mediaNotas);
					break;
				}else if (mediaNotas < 5) {
					
					System.out.println("Nota del primer control: " + notaUno);
					System.out.println("Nota del segundo control: " + notaDos);
					System.out.println("¿Cual ha sido el resultado de la recuperacion? (apto/no apto): ");
					recuperacionNota = sc.nextLine();
					
				}
									
				if (recuperacionNota.equalsIgnoreCase("apto")) {
					double mediaNotaApto = 5;
						System.out.println("Tu nota de programación es de: " + mediaNotaApto);
						break;
				} else if (recuperacionNota.equalsIgnoreCase("no apto")) {
						System.out.println("Tu nota de programación es de: " + mediaNotas);
						break;
					}
				
				
				
				
				
				
				
				
			
			
		}

	}

}
