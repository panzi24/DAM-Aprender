package ejerciciosUnidad3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int opcionMenuUser = 0;
		int controlMenu = 0;





		int victoriasNewton = 0;
		int victoriasWizard = 0;

		int golpeNewton = 0;
		int golpeWizard = 0;


	

		int contadorIteraciones = 0;


		while (controlMenu == 0) {

			int vidaNewton = 100;
			int vidaWizard = 100;

			int golpeWizardRandom = 0;

			int combateTerminado = 0;


			System.out.println("option 1 contest between Magic Newton and Turing Wizard: ");
			System.out.println("option 2 display number of Magic Newton wins: ");
			System.out.println("option 3 display number of Turing Wizard wins: ");
			System.out.println("opción 0 salir del programa: ");
			System.out.println("Elige una opcion: ");



			opcionMenuUser = sc.nextInt();

			

			switch (opcionMenuUser) {
			case 1:

				System.out.println("Ejecutando opcion 1");

				while (combateTerminado == 0) {
					contadorIteraciones = 0;
					vidaNewton = 100;
					vidaWizard = 100;
					int golpeNewtonRandom = rn.nextInt(1, 4);

					if(golpeNewtonRandom == 1) {
						System.out.println("Newton lanza ataque: Apple go down");
						golpeNewton = 20;
						
					}else if (golpeNewtonRandom == 2) {
						System.out.println("Newton lanza ataque: Gravity will increase");
						golpeNewton = 35;
						
					}else if (golpeNewtonRandom == 3) {
						System.out.println("Newton lanza ataque: Apply relativity");
						golpeNewton = 55;
						
					}
					
					System.out.println("El ataque de Newton quita: " + golpeNewton);
					vidaWizard -= golpeNewton;
					if (vidaWizard <=1) {
						System.out.println("El ganador es newton");
						victoriasNewton++;
						break;
					}
					
					
					if(golpeWizardRandom == 1) {
						System.out.println("Wizard lanza ataque: Nuclear rotor");
						golpeWizard = 20;
						vidaNewton -= 55;

					}else if (golpeWizardRandom == 2) {
						System.out.println("Wizard lanza ataque: Quantic computer");
						golpeWizard = 35;
						vidaNewton -= 55;

					}else if (golpeWizardRandom == 3) {
						System.out.println("Wizard lanza ataque: Cesar cipher");
						golpeWizard = 55;
						vidaNewton -= 55;


					}
					
					System.out.println("El ataque de Wizard quita: " + golpeWizard);
					vidaNewton -= golpeWizard;
					if (vidaWizard <=1) {
						System.out.println("El ganador es newton");
						victoriasWizard++;
						break;
					}
					
					
					
				}	
				


				break;
			case 2:

				System.out.println("Ejecutando opcion 2");

				System.out.println("Las victorias de Newton es: " + victoriasNewton);
				System.out.println("-".repeat(50));




				break;
			case 3:
				System.out.println("Ejecutando opcion 3");

				System.out.println("Las victorias de Wizard es: " + victoriasWizard);
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
