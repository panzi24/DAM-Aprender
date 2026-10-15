package ejerciciosUnidad2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int opcionMenuUser = 0;
		int controlMenu = 0;
		Random rn = new Random();
		
		

	
		
		int randomFerrari = 0;
		int randomLambo = 0;
		int velocidadMediaFerrari = 340;
		int velocidadMediaLambo = 315;
		int victoriaFerrari = 0;
		int victoriaLambo= 0;
		int velocidadCarreraFerrari = 0;
		int velocidadCarreraLambo = 0;
		int posicionFerrari = 0;
		int posicionLambo = 0;
		int contadorIteraccion = 0;
		int contadorKmsFerrari= 0;
		int contadorKmsLambo = 0;




		while (controlMenu == 0) {
			

			System.out.println("Opcion 1 calculamos velocidad ferrari: ");
			System.out.println("Opcion 2 calculamos velocidad lambo: ");
			System.out.println("Opcion 3 carrera en circuito: ");
			System.out.println("Opcion 4 victorias ferrari: ");
			System.out.println("Opcion 5 victorias lambo: ");
			System.out.println("Opcion 6 KMS del ferrari total: ");
			System.out.println("Opcion 7 KMS del lambo total: ");
			System.out.println("Opcion 0 salir del programa: ");
			System.out.println("Elige una opcion: ");
			
			opcionMenuUser = sc.nextInt();

			
			switch (opcionMenuUser) {
			case 1:
				
				System.out.println("Ejecutando opcion 1");
				randomFerrari = rn.nextInt(51);
				System.out.println("Ramdom Ferrari: " + randomFerrari);
				velocidadCarreraFerrari = velocidadMediaFerrari + randomFerrari;
				System.out.println("La velocidad del ferrari: " + velocidadCarreraFerrari);
				
				
				
				
				
				break;
			case 2:
				
				System.out.println("Ejecutando opcion 2");
				randomFerrari = rn.nextInt(75);
				System.out.println("Ramdom Lambo: " + randomLambo);
				velocidadCarreraLambo = velocidadMediaLambo + randomLambo;
				System.out.println("La velocidad del ferrari: " + velocidadCarreraLambo);
				
				
				
				
				
				
				
				break;
			case 3:
				System.out.println("Ejecutando opcion 3");
				
				posicionFerrari = 0;
				posicionLambo = 0;
				
				while(posicionFerrari < 1000 && posicionLambo < 1000) {
					posicionFerrari += velocidadCarreraFerrari;
					posicionLambo+= velocidadCarreraLambo;
					
					System.out.println("Posicion Ferrari: " + posicionFerrari);
					System.out.println("Posicion Lambo: " + posicionLambo);
					
					contadorIteraccion++;
					System.out.println("Total iteracciones: " + contadorIteraccion);
					System.out.println("-".repeat(50));

					
				}
				
				if (posicionFerrari > posicionLambo) {
					victoriaFerrari ++;
					System.out.println("Victoria Ferrari");
				} else if (posicionFerrari < posicionLambo) {
					victoriaLambo++;
					System.out.println("Victoria Lambo");

				}else {
					System.out.println("Empate");
				}

				contadorKmsFerrari+= posicionFerrari;
				contadorKmsLambo+= posicionLambo;
				break;
				
				
			case 4:
				System.out.println("Ejecutando opcion 4");
				System.out.println("vicotrias para ferrari: " + victoriaFerrari );
				break;
			case 5:
				System.out.println("Ejecutando opcion 5");
				System.out.println("vicotrias para lambo: " + victoriaLambo );

				break;
			case 6:
				System.out.println("Ejecutando opcion 6");
				System.out.println("kilometros para ferrari: " + contadorKmsFerrari );

				break;
			case 7:
				System.out.println("Ejecutando opcion 7");
				System.out.println("kilometros para lambo: " + contadorKmsLambo );

				break;
			case 0:
				System.out.println("Ejecutando opcion 0");
				controlMenu = 1;
				break;
			default:
				System.out.println("Error, no tenemos esa opcion");
			}
		}

		System.out.println("Fin del program");


	}

}
