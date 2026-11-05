package ejerciciosUnidad3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int opcionMenuUser = 0;
		int controlMenu = 0;

		
		int azarRonda = 0;
		int azarDisparo = 0;
		int azarRacha = 0;
		//
		int ataqueMilenario = 0;
		int ataqueImperial = 0;
		
		//
		int naveMilenariaRachaDisparo = 0;
		int naveImperialRachaDisparo = 0;
		
		//
		int naveMilenariaDisparo = 0;
		int naveImperialDisparo = 0;
		
		//
		int totalBatallas = 0;
		int totalDisparos = 0;
		int victoriasMilenario = 0;
		int victoriasImperial = 0;
		int porcentajeVictoriasMilenario = 0;
		int porcentajeVictoriasImperial = 0;
		
		//
		int numeroDisparosMilenaria = 0;
		int numeroDisparosImperial = 0;
		int porcentajeDisparosMilenario = 0;
		int porcentajeDisparosImperial = 0;

		int habilidadRachaMilenaria = 0;
		int habilidadRachaImperial = 0;

		int contadorIteraciones = 0;
		
		int vidaMilenario = 0;
		int vidaImperial= 0;

		int habilitaTurnoMilenario = 0;
		int habilitaTurnoImperial = 0;
		
		while (controlMenu == 0) {


		
			System.out.println("opción 1 calcular habilidad de disparo: ");
			System.out.println("opción 2 calcular habilidad de racha de disparos: ");
			System.out.println("opción 3 calcular número de disparos en la racha: ");
			System.out.println("opción 5 mostrar número batallas ganadas y % victorias por el halcón milenario: ");
			System.out.println("opción 6 mostrar número carreras ganadas y % victorias por la nave imperial: ");
			System.out.println("opción 7 mostrar número de disparos y % de El halcón milenario: ");
			System.out.println("opción 8 mostrar número de disparos y % de La nave imperial: ");
			System.out.println("opción 0 salir del programa: ");
			System.out.println("-".repeat(50));
			System.out.println("Elige una opcion: ");



			opcionMenuUser = sc.nextInt();

			

			switch (opcionMenuUser) {
			case 1:

				System.out.println("Ejecutando opcion 1");
				System.out.println("-".repeat(50));

				ataqueMilenario = rn.nextInt(2, 11);
				System.out.println("Habilidad de la nave uno del disparo es: " + ataqueMilenario);

				ataqueImperial = rn.nextInt(2, 11);
				System.out.println("Habilidad de la nave dos del disparo es: " + ataqueImperial);
				System.out.println("-".repeat(50));



				break;
				
			case 2:

				System.out.println("Ejecutando opcion 2");
				System.out.println("-".repeat(50));

				habilidadRachaMilenaria = rn.nextInt(50, 81);
				System.out.println("Racha de habilidad de la nave uno del disparo es: " + habilidadRachaMilenaria);

				habilidadRachaImperial = rn.nextInt(50, 81);
				System.out.println("Racha de habilidad de la nave dos del disparo es: " + habilidadRachaImperial);
				System.out.println("-".repeat(50));

				break;
				
			case 3:
				System.out.println("Ejecutando opcion 3");
				System.out.println("-".repeat(50));

				naveMilenariaDisparo = rn.nextInt(2, 6);
				System.out.println("Numero de disparos de la nave 1: " + naveMilenariaDisparo);

				naveImperialDisparo = rn.nextInt(2, 6);
				System.out.println("Numero de disparos de la nave 2: " + naveImperialDisparo);
				System.out.println("-".repeat(50));
				break;
			case 4:
				System.out.println("opción 4 empezar batalla:");
				vidaImperial = 100;
				vidaMilenario = 100;
				contadorIteraciones = 0;
				totalBatallas++;
				//empieza
				while(vidaImperial> 0 && vidaMilenario > 0) {
					//ver quien dispara
					habilitaTurnoMilenario = 0;
					habilitaTurnoImperial = 0;
					contadorIteraciones++;
					
					azarDisparo = rn.nextInt(100);
					if (azarDisparo < 50) {
						habilitaTurnoMilenario = 10;
						
					}else if (azarDisparo >= 50) {
						habilitaTurnoImperial = 10;
					}
					
					if (habilitaTurnoMilenario == 10) {
						System.out.println("Disparando el halcón milenario");
						azarRacha = rn.nextInt(100);
						if(azarRacha < habilidadRachaMilenaria && vidaImperial > 0) {
							System.out.println("Racha activado: " + naveMilenariaDisparo);
							
							for (int i = 0; i < naveMilenariaDisparo && vidaImperial > 0; i++ ) {
								
								System.out.println("Disparo Nº" + (i+1));
								vidaImperial -= ataqueMilenario;
								numeroDisparosMilenaria++;
								System.out.println("Vida del imperio: " + vidaImperial);
								System.out.println("-".repeat(50));
								
							}
							
						}else {
							System.out.println("No hay racha del Halcon Milenario");
							vidaImperial -= ataqueMilenario;
							numeroDisparosMilenaria++;
							System.out.println("Vida del imperio: " + vidaImperial);
							System.out.println("-".repeat(50));

						}
					}
					
					
					
					if (habilitaTurnoImperial == 10) {
						System.out.println("Disparando el Nave Imperial");
						azarRacha = rn.nextInt(100);
						if(azarRacha < habilidadRachaImperial && vidaMilenario > 0) {
							System.out.println("Racha activado: " + naveImperialDisparo);
							
							for (int i = 0; i < naveImperialDisparo && vidaMilenario > 0; i++) {
								
								System.out.println("Disparo Nº" + i+1);
								vidaMilenario -= ataqueImperial;
								numeroDisparosImperial++;
								System.out.println("Vida del imperio: " + vidaMilenario);
								System.out.println("-".repeat(50));

								
							}
							
						}else {
							System.out.println("No hay racha de la nave milenaria");
							vidaMilenario -= ataqueImperial;
							numeroDisparosImperial++;
							System.out.println("Vida del halcon milenario: " + vidaMilenario);
							System.out.println("-".repeat(50));

						}
					}
					
					if (vidaMilenario <= 0) {
						victoriasImperial++;
						break;
					}else if (vidaImperial <= 0) {
						victoriasMilenario++;
						break;
					}
					
					
					
				}
				
				
				
				
				
				break;
				
			case 5:
				System.out.println("Ejecutando opcion 5");
				
				if(totalBatallas > 0) {
					porcentajeVictoriasMilenario = victoriasMilenario * 100 / totalBatallas;
				}
				

				System.out.println("Batallas ganadas del Halcon Milenario: " + victoriasMilenario);
				System.out.println("El porcentaje de victorias del Halcon Milenario es: " + porcentajeVictoriasMilenario + "%");
				System.out.println("-".repeat(50));



				
				break;
				
			case 6:
				System.out.println("Ejecutando opcion 6");
				
				if(totalBatallas > 0) {
					porcentajeVictoriasImperial = victoriasImperial * 100 / totalBatallas;
				}
				
				System.out.println("Batallas ganadas del Halcon Imperial: " + victoriasImperial);
				System.out.println("El porcentaje de victorias de la nave imperial es: " + porcentajeVictoriasImperial + "%");
				System.out.println("-".repeat(50));

				break;
				
			case 7:
				System.out.println("Ejecutando opcion 7");

				totalDisparos = numeroDisparosMilenaria + numeroDisparosImperial;

				if(totalDisparos > 0) {
					porcentajeDisparosMilenario = numeroDisparosMilenaria * 100 / totalDisparos;
				}
				
				System.out.println("El numero de disparos del halcon milenial es de: " + numeroDisparosMilenaria);
				System.out.println("El porcentaje del disparo del halcon milenial es de: " + porcentajeDisparosMilenario + "%");

				System.out.println("-".repeat(50));

				break;
				
			case 8:
				System.out.println("Ejecutando opcion 8");
				totalDisparos = numeroDisparosMilenaria + numeroDisparosImperial;

				if(totalDisparos > 0) {
					porcentajeDisparosImperial= numeroDisparosImperial * 100 / totalDisparos;
				}
				
				System.out.println("El numero de disparos de la nave imperial es de: " + numeroDisparosImperial);
				System.out.println("El porcentaje del disparo de la nave imperial es de: " + porcentajeDisparosImperial + "%");
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
