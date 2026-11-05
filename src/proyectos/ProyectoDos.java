package proyectos;

import java.util.Random;
import java.util.Scanner;

public class ProyectoDos {
//SIMON OCHOA IBAÑEZ
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int opcionMenuUser = 0;
		int controlMenu = 0;

		//número de carreras ganadas
		int carrerasMario = 0;
		int carrerasBowser = 0;
		
		// configuración (opciones 1, 2 y 3)
		int velocidadMario = 0;
		int velocidadBowser = 0;
		//Turbo
		int probabilidadTurboMario = 0;
		int probabilidadTurboBowser = 0;
		//Avance turbo
		int avenceExtraMario = 0;
		int avenceExtraBowser = 0;
		int avanceTurboMario = 0;
		int avanceTurboBowser = 0;


		//Victorias
		int totalCarreras = 0;
		int victoriasMario = 0;
		int victoriasBowser = 0;
		int porcentajeVictoriasMario = 0;
		int porcentajeVictoriasBowser = 0;
		
		// carrera actual
		int distanciaMeta = 100;
		int distanciaMario = 0;
		int distanciaBowser = 0;
		
		//Iteracciones
		int contadorIteraciones = 0;

		
		//número total de iteraciones en las que avanzó
		int turnosMario = 0;
		int turnosBowser = 0;
		int porcentajeTurnosMario = 0;
		int porcentajeTurnosBowser = 0;
		int totalTurnos = 0;

		
		while (controlMenu == 0) {
			
			int tiradaTurno = 0;
			int tiradaTurbo = 0;
			int avanceTurno = 0;

		
			System.out.println("1. Calcular la velocidad base de los karts: ");
			System.out.println("2. Calcular la probabilidad de turbo: ");
			System.out.println("3. Calcular el avance del turbo: ");
			System.out.println("4. ¡Empezar la carrera!: ");
			System.out.println("5. Ver carreras ganadas y % de victorias de Mario: ");
			System.out.println("6. Ver carreras ganadas y % de victorias de Bowser ");
			System.out.println("7. Ver turnos y % de Mario");
			System.out.println("8. Ver turnos y % de Bowser");
			System.out.println("opción 0 salir del programa: ");
			System.out.println("-".repeat(50));
			System.out.println("Elige una opcion: ");



			opcionMenuUser = sc.nextInt();

			

			switch (opcionMenuUser) {
			case 1:
				System.out.println("-".repeat(50));
				System.out.println("Calculando velocidades de los personajes....");
				System.out.println("=".repeat(50));

				velocidadMario = rn.nextInt(2, 11);
				System.out.println("La velocidad de Mario es de: " + velocidadMario + "m");
				
				velocidadBowser = rn.nextInt(2, 11);
				System.out.println("La velocidad de Bowser es de: " + velocidadBowser + "m");
				System.out.println("-".repeat(50));

				break;
				
			case 2:
				System.out.println("-".repeat(50));
				System.out.println("Calculando el turbo de los personajes....");
				System.out.println("=".repeat(50));

				probabilidadTurboMario = rn.nextInt(1, 100);
				System.out.println("La probalidad del turbo de Mario es de: " + probabilidadTurboMario + "%");
				
				probabilidadTurboBowser = rn.nextInt(1, 100);
				System.out.println("La probalidad del turbo de Bowser es de: " + probabilidadTurboBowser  + "%");
				System.out.println("-".repeat(50));
				

				break;
				
			case 3:
				
				System.out.println("-".repeat(50));
				System.out.println("Calculando el  avance del turbo de los personajes....");
				System.out.println("=".repeat(50));

				avanceTurboMario = rn.nextInt(5, 16);
				System.out.println("El avance de Mario del turbo es de: " + avanceTurboMario + "m");
				
				avanceTurboBowser = rn.nextInt(5, 16);
				System.out.println("El avance de Bowser del turbo es de: " + avanceTurboBowser + "m");
				System.out.println("-".repeat(50));
				
				break;
				
			case 4:

				if (velocidadMario == 0 || velocidadBowser == 0 || probabilidadTurboMario == 0 || probabilidadTurboBowser == 0
		        || avanceTurboMario == 0 || avanceTurboBowser == 0) {

					System.out.println("-".repeat(50));
					System.out.println("Primero debes configurar las opciones 1, 2 y 3");
					System.out.println("-".repeat(50));
					break;
				}
				
				
				
				distanciaMario = 0;
				distanciaBowser = 0;
				totalCarreras++;           
				contadorIteraciones = 0;   

				while (distanciaMario < distanciaMeta && distanciaBowser < distanciaMeta) {

					tiradaTurno = rn.nextInt(1, 100);
					tiradaTurbo = rn.nextInt(1, 100);
					contadorIteraciones++;
					System.out.println("Turno: " + contadorIteraciones);

					
					if (tiradaTurno > 50) {
						turnosMario++;
						System.out.println("-".repeat(50));
						System.out.println("Avanza Mario");
						System.out.println("Velocidad de Mario: " + velocidadMario + " m");
						avanceTurno = velocidadMario;
						if (tiradaTurbo <= probabilidadTurboMario) { 
							avanceTurno += avanceTurboMario;
							System.out.println("Turbo de Mario activado: +" + avanceTurboMario + " m, avanza " + avanceTurno + " m");						} else {
							avanceTurno -= 3;
							if (avanceTurno < 1) {
								avanceTurno = 1;
							}
							System.out.println("Mario no ha activado el turbo y se caló el coche se le reduce la velociddad -3m: " + avanceTurno);
						}

						distanciaMario += avanceTurno;
						System.out.println("Distancia de Mario: " + distanciaMario + " m");
					}

					if (tiradaTurno <= 50) {

						turnosBowser++;
						System.out.println("-".repeat(50));
						System.out.println("Avanza Bowser");
						avanceTurno = velocidadBowser;
						System.out.println("Velocidad de Bowser: " + velocidadBowser + " m");
						if (tiradaTurbo <= probabilidadTurboBowser) {   
							avanceTurno += avanceTurboBowser;
							System.out.println("Turbo de Bowser activado: +" + avanceTurboBowser + " m, avanza " + avanceTurno + " m");						} else {
							avanceTurno -= 3;
							if (avanceTurno < 1) {
								avanceTurno = 1;
							}
							System.out.println("Bowser no ha activado el turbo y se caló el coche se le reduce la velociddad (-3m): " + avanceTurno + "m" );
						}

						distanciaBowser += avanceTurno;
						System.out.println("Distancia de Bowser: " + distanciaBowser + " m");
					}

					System.out.println("-".repeat(50));

					if (distanciaMeta <= distanciaMario) {
						victoriasMario++;
						System.out.println("Ha ganado Mario");
						break;
					} else if (distanciaMeta <= distanciaBowser) {
						victoriasBowser++;
						System.out.println("Ha ganado Bowser");
						break;
					}
				}
				
				System.out.println("-".repeat(50));
				System.out.println("La carrera ha durado " + contadorIteraciones + " turnos");
				System.out.println("-".repeat(50));

				break;
				
			case 5:
				
				if (totalCarreras > 0) {
					porcentajeVictoriasMario = victoriasMario * 100 / totalCarreras; 
				}
				

				System.out.println("Carreras ganadas de Mario: " + victoriasMario);
				System.out.println("El porcentaje de victorias de Mario es: " + porcentajeVictoriasMario + "%");
				System.out.println("-".repeat(50));

				
				break;
				
			case 6:
				
				if (totalCarreras > 0) {
					porcentajeVictoriasBowser = victoriasBowser * 100 / totalCarreras; 
				}
				

				System.out.println("Carreras ganadas de Bowser: " + victoriasBowser);
				System.out.println("El porcentaje de victorias de Bowser es: " + porcentajeVictoriasBowser + "%");
				System.out.println("-".repeat(50));
				
				break;
				
			case 7:
				//Ver turnos y % de Mario
				totalTurnos = turnosMario + turnosBowser;
				
				if (totalTurnos > 0) {
					porcentajeTurnosMario = turnosMario * 100 / totalTurnos;
				}
				System.out.println("-".repeat(50));

				System.out.println("Los turnos de mario han sido de: " + turnosMario + " turnos" );
				System.out.println("Porcentaje de los turnos: " + porcentajeTurnosMario + "%");
				System.out.println("-".repeat(50));

				break;
				
			case 8:
				totalTurnos = turnosBowser + turnosMario;
				
				if (totalTurnos > 0) {
					porcentajeTurnosBowser = turnosBowser * 100 / totalTurnos;
				}
				System.out.println("-".repeat(50));

				System.out.println("Los turnos de mario han sido de: " + turnosBowser + " turnos" );
				System.out.println("Porcentaje de los turnos: " + porcentajeTurnosBowser + "%");
				System.out.println("-".repeat(50));

				break;
				


			case 0:
				System.out.println("Ejecutando opcion 0");
				controlMenu = 1;
				break;
			default:
				System.out.println("=".repeat(50));
				System.out.println("Número de programa no encontrado");
				System.out.println("=".repeat(50));
			}
		}

		System.out.println("Fin del program");						
	}

}
