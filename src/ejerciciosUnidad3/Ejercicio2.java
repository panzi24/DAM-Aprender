package ejerciciosUnidad3;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Handler;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int opcionMenuUser = 0;
		int controlMenu = 0;
		
		
	
		
		
		int victoriasRyu = 0;
		int victoriasKen = 0;
		
		int lanzarPunetazo = 0;
		
		int quitarVida = 31;
		
		
		while (controlMenu == 0) {
			
			int vidaRyu = 100;
			int vidaKen = 100;
			
			int combateTerminado = 0;
			
			
			System.out.println("opción 1 combate entre Ryu y Ken: ");
			System.out.println("opción 2 visualizar victorias de Ryu: ");
			System.out.println("opción 3 visualizar victorias de Ken: ");
			System.out.println("opción 0 salir del programa: ");
			System.out.println("Elige una opcion: ");

			
			opcionMenuUser = sc.nextInt();

			
			switch (opcionMenuUser) {
			case 1:
				
				System.out.println("Ejecutando opcion 1");
				
				while (combateTerminado == 0) {
					lanzarPunetazo = rn.nextInt(quitarVida);
					vidaKen = vidaKen - lanzarPunetazo;
			        System.out.println("Ryu ataca y quita " + lanzarPunetazo + ". Vida de Ken: " + vidaKen);
					
					if (vidaKen < 1) {
						victoriasRyu++;
						System.out.println("Ha ganado ryu");
			            combateTerminado = 1;
					}else {
			            lanzarPunetazo = rn.nextInt(quitarVida);
			            vidaRyu = vidaRyu - lanzarPunetazo;
						System.out.println("Ha ganado ken");
			            System.out.println("Ken ataca y quita " + lanzarPunetazo + ". Vida de Ryu: " + vidaRyu);

					}
					if (vidaRyu < 1) {
						victoriasKen++;
						System.out.println("Ha ganado Ken");
						combateTerminado = 1;
					}
					
			        System.out.println("-".repeat(50));

				}	
						
				break;
			case 2:
				
				System.out.println("Ejecutando opcion 2");
				
				System.out.println("Las victorias de Ryu es: " + victoriasRyu);
				System.out.println("-".repeat(50));
				
				
				
				
				break;
			case 3:
				System.out.println("Ejecutando opcion 3");
				
				System.out.println("Las victorias de Ken es: " + victoriasKen);
				System.out.println("-".repeat(50));
				
				break;
			
		
			case 0:
				System.out.println("Ejecutando opcion 0");
				controlMenu = 1;
				break;
			default:
				System.out.println("Número de programa no encontrado");
			}
		}

		System.out.println("Fin del program");						
	}

}
