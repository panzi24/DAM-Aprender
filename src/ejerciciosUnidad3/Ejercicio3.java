package ejerciciosUnidad3;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Handler;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int opcionMenuUser = 0;
		int controlMenu = 0;
		
		int proyectosConstructora = 0;
		int proyectosElectricos = 0;

		int progresoConstructora = 0;
		int progresoElectrica = 0;

		int iteraciones = 0;
		
		int capacidadTrabajo = rn.nextInt();
		
		boolean constructoraTerminada = false;
		boolean electricaTerminada = false;
		
		while (controlMenu == 0) {
			

			
			
			System.out.println("opción 1 introducir empresa constructora");
			System.out.println("opción 2 introducir empresa eléctrica");
			System.out.println("opción 4 mostrar proyectos en plazo de la empresa constructora");
			System.out.println("opción 5 mostrar proyectos en plazo de la empresa eléctrica");
			System.out.println("opción 0 salir del programa: ");
			System.out.println("Elige una opcion: ");

			
			opcionMenuUser = sc.nextInt();

			
			switch (opcionMenuUser) {
			case 1:
				
				System.out.println("Ejecutando opcion 1");
				
				System.out.println("La empresa constructora empezara");
				
				capacidadTrabajo = rn.nextInt(21);
			
				progresoConstructora += capacidadTrabajo;
			
				System.out.println("Lleva: " + progresoConstructora);
				
				break;
			case 2:
				System.out.println("Ejecutando opcion 2");
							
				System.out.println("La empresa electrica empezara");
				
				capacidadTrabajo = rn.nextInt(21);
			
				progresoElectrica += capacidadTrabajo;
			
				System.out.println("Lleva: " + progresoElectrica);
				
				
				break;
			case 3:
				System.out.println("Ejecutando opcion 3");
			
				iteraciones = 0;
				
				while (progresoConstructora < 100 || progresoElectrica < 100) {
					
					iteraciones++;
					capacidadTrabajo = 0;
					
					if (progresoConstructora < 100) {
						capacidadTrabajo = rn.nextInt(21);
						progresoConstructora += capacidadTrabajo;
					}

					if (progresoElectrica < 100) {
						capacidadTrabajo = rn.nextInt(21);
						progresoElectrica += capacidadTrabajo;

					}
					
					if (progresoConstructora >= 100 && constructoraTerminada == false) {
						constructoraTerminada = true;
						if (iteraciones < 8) {
							proyectosConstructora +=1;
						}
					}
					
					if (progresoElectrica >= 100 && electricaTerminada == false) {
						electricaTerminada = true;
						if (iteraciones < 8) {
							proyectosElectricos +=1;
						}
					}
					
					System.out.println("Iteraccion: " + iteraciones);
					System.out.println("Constructora lleva: " + progresoConstructora);
					System.out.println("Electrica lleva: " + progresoElectrica);
					System.out.println("-".repeat(50));
					
				}
				
			
				break;
				
			case 4:
			    System.out.println("Proyectos de la constructora terminados en plazo: " + proyectosConstructora);
			    break;

			case 5:
			    System.out.println("Proyectos de la empresa electrica terminados en plazo: " + proyectosElectricos);
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
